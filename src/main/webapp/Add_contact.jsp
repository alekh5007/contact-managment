
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
               
    <div class="card">
    
    <div class="card-header text-center">
    <h3>Add Contact Here !!</h3>
    </div>
    
  <div class="card-body">
    <%@include file="message.jsp" %>
  
    <form action="AddContactServlet"  method="post">
   
    
  <div class="mb-3">
    <label class="form-label">First Name</label>
    <input type="text"  name="first_name"  class="form-control" >
     </div>
  
  
  <div class="mb-3">
    <label  class="form-label">Last Name</label>
    <input type="text"  name="last_name" class="form-control" >
    </div>
    
    <div class="mb-3">
    <label  class="form-label">Email</label>
    <input type="email"  name="email" class="form-control" >
    </div>
    
    <div class="form-check">
  <input name="fav" class="form-check-input" type="checkbox" value="true" id="fav1">
  <label class="form-check-label" for="fav1">
    Favorite
  </label>
</div>

<div class="mb-3">
    <label  class="form-label">Country Code</label>
    <input type="text"  name="country_code" class="form-control" value="+91" >
    </div>
    
     <div class="mb-3">
    <label  class="form-label">Phone</label>
    <input type="text"  name="phone" class="form-control" >
    </div>
    
    
    
  </div>
  
  </div>
 
  
  
  <button type="submit" class="btn btn-primary text-center">Submit</button>
  
</form>
  </div>
  </div>
</div>
</div>
 </div>
       

  </body>
</html>