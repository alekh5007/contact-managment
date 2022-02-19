
<%@include file="templates/auth.jsp" %>
<% 
User u1=(User)session.getAttribute("currentuser");
String name=u1.getName();
%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <title>profile here</title>
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
      <%@include file="templates/css_js.jsp" %>
  </head>
  <body>
  <%@include file="templates/admin_nav.jsp" %>
     
    <div class="container">
       <div class="row mt-5">
       
           <div class="col-md-3">
            <%@ include file="templates/sidemenu.jsp" %>
           </div>
           
           <div class="col-md-9">
              <h1>Welcome <%=name %></h1>
              <h1>Your Email id is <%=u1.getEmail() %></h1>
              <h1> Status:-<%=u1.getStatus() %></h1>
              <h1>Your Address is <%=u1.getAddress() %></h1>
           </div>
           
       </div>
    
    </div>

  </body>
</html>