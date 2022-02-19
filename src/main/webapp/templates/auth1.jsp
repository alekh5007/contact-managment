<%@page import="com.learn.entities.Message"%>
<%@page import="com.learn.entities.User"%>
<% 
User user1=(User)session.getAttribute("currentuser");
if(user1!=null){

	response.sendRedirect("profile.jsp");
	return;
}

%>