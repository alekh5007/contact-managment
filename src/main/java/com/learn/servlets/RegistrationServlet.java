package com.learn.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.dao.UserDao;
import com.learn.entities.Message;
import com.learn.entities.User;
import com.learn.helper.ConnectionProvider;
@WebServlet(name="RegistrationServlet",urlPatterns ="/RegistrationServlet")
public class RegistrationServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String status=req.getParameter("status");
	
		System.out.println(name+":"+email+":"+password+":"+address+":"+status);
		try {
			
			Connection connectionn = ConnectionProvider.getConnection();
			System.out.println(connectionn);
			UserDao userdao = new UserDao(connectionn);
			User u=new User();			
			u.setName(name);
			u.setEmail(email);
			u.setPassword(password);
			u.setAddress(address);
			u.setStatus(status);
		    u.setImage("default.png");	
		    boolean addUser = userdao.addUser(u);
		    HttpSession session = req.getSession();
		    
		    if(addUser) {
		    	Message message = new Message("Sucessfully Registered","success");
		    	session.setAttribute("msg", message);
		    	resp.sendRedirect("register.jsp");
		    	
		    }else {
		    	Message message = new Message("something went wrong","danger");
		    	session.setAttribute("msg", message);
		    	resp.sendRedirect("register.jsp");
		    }
			System.out.println(userdao.addUser(u)?"added":"eror");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
