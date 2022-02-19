package com.learn.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.dao.ContactDao;
import com.learn.dao.PhoneDao;
import com.learn.dao.UserDao;
import com.learn.entities.Contact;
import com.learn.entities.Message;
import com.learn.entities.Phone;
import com.learn.entities.User;
import com.learn.helper.ConnectionProvider;
@WebServlet(name="AddContactServlet",urlPatterns = "/AddContactServlet")
public class AddContactServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String first_name=req.getParameter("first_name");
	String last_name=req.getParameter("last_name");
	String email=req.getParameter("email");
	String fav=req.getParameter("fav");
	boolean fav_value=(fav==null)?false:true;
	
	 HttpSession session = req.getSession();
	 User u123=(User) session.getAttribute("currentuser");
	 String user_id=u123.getEmail();
	 
		
		String country_code=req.getParameter("country_code");
		String phone=req.getParameter("phone");
	 
	 
	try {
		Connection connectionn = ConnectionProvider.getConnection();
		System.out.println(connectionn);
		ContactDao cd=new ContactDao(connectionn);
		Contact cs=new Contact();
		cs.setFirst_name(first_name);
		cs.setLast_name(last_name);
		cs.setEmail(email);
		cs.setFavorite(fav_value);
		cs.setUser_id(user_id);
		
		int iscontactadded=cd.addContact(cs);
		
		//int cdddd=cd.displaymyAllContact();
		System.out.println("iscontact added"+iscontactadded);
		
		Connection connect = ConnectionProvider.getConnection();
		PhoneDao phd=new PhoneDao(connect);
		Phone phh=new Phone();
		phh.setCountry_code(country_code);
		phh.setPhone_no(phone);
		phh.setCid(iscontactadded);
		
		boolean addPhone = phd.addPhone(phh);
		System.out.println("is phone added"+addPhone);
		 Message message = new Message("Contact added successfully!!","info");
	    	session.setAttribute("msg", message);
	    	
	    	
		resp.sendRedirect("Add_contact.jsp");
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	 

	//System.out.println(first_name+":"+last_name+":"+email+":"+fav_value+":"+phone+":"+country_code+":");
	}

}
