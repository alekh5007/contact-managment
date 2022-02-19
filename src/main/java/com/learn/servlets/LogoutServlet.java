package com.learn.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.entities.Message;
@WebServlet(name="LogoutServlet",urlPatterns = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session = req.getSession();
		 session.removeAttribute("currentuser");
		 Message message = new Message("Logout successfully !!","info");
	    	session.setAttribute("msg", message);
	    	//resp.sendRedirect("login.jsp");
	    	resp.sendRedirect("login.jsp");
	}

}
