<%@page import="com.learn.entities.Message"%>
<%@page import="com.learn.entities.User"%>
<% 
User user1=(User)session.getAttribute("currentuser");
if(user1==null){
	Message msgg=new Message("you are not logged in !!", "danger");
	session.setAttribute("msg", msgg);
	response.sendRedirect("login.jsp");
	return;
}

%>