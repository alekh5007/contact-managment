<%@include file="templates/auth1.jsp" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <title>Hello, world!</title>
     
      <%@include file="templates/css_js.jsp" %>
  </head>
  <body>
 
  <%@include file="templates/navbar.jsp" %>
     <%@include file="message.jsp" %>
    <div class="container-fluid">
    
   <div class="row">
   <div class="col-md-6 offset-md-3">
    <div class="card">
    
    <div class="card-header text-center">
    <h3>Register Here !!</h3>
    </div>
    
  <div class="card-body">
  
    <form action="RegistrationServlet" method="post" onsubmit="return validate()">
     <div class="mb-3">
    <label class="form-label">Name</label>
    <input id="reg_name" type="text" name="name" class="form-control " >
    <div id="reg_name_error_msg" class="invalid-feedback">
         
        </div>
  </div>
    
  <div class="mb-3">
    <label class="form-label">Email address</label>
    <input  id="reg_email" type="text" name="email" class="form-control" >
    <div id="reg_email_error_msg" class="invalid-feedback">
   
    </div>
    
  </div>
  
  <div class="mb-3">
    <label  class="form-label">Password</label>
    <input type="password" id="reg_password"   name="password" class="form-control" >
    <div id="reg_password_error_msg" class="invalid-feedback">
   
    </div>
  </div>
 
  <div class="mb-3">
    <label class="form-label">Address</label>
   <textarea id="reg_address" type="address" rows="3" name="address" cols="50" class="form-control"></textarea>
    <div id="reg_address_error_msg" class="invalid-feedback">
   
    </div>
  </div>
  
  <div class="mb-3">
    <label class="form-label">Status</label>
    <input type="text" id="reg_status" name="status" class="form-control" >
       <div id="reg_status_error_msg" class="invalid-feedback">
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