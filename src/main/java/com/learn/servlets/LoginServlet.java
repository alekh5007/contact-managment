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

@WebServlet(name="LoginServlet", urlPatterns="/LoginServlet")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		try {
			Connection connectionn = ConnectionProvider.getConnection();
			System.out.println(connectionn);
			UserDao userdao = new UserDao(connectionn);
			 User user=userdao.getEmailAndPassword(email, password);
			 HttpSession session = req.getSession();
			 if(user==null) {
				 //not login
				 System.out.println("login failed");
				 Message message = new Message("Login Failed try again !!","danger");
			    	session.setAttribute("msg", message);
			    	//resp.sendRedirect("login.jsp");
			    	resp.sendRedirect("login.jsp");
			 }
			 else {
				 //login
				 session.setAttribute("currentuser", user);
				 System.out.println("successfully login");
				 resp.sendRedirect("profile.jsp");
				 
			 }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
