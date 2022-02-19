<%@page import="com.learn.entities.User"%>
<% 
User u12=(User)session.getAttribute("currentuser");
String namee=u12.getName();
%>
<nav class="navbar navbar-expand-lg navbar-light mycolor">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Welcome to Contact Manager</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#"><b><%=namee %></b></a>
        </li>
      </ul>
      <form class="d-flex">
       
      
         <a class="nav-link" href="LogoutServlet">Logout</a>
      </form>
    </div>
  </div>
</nav>