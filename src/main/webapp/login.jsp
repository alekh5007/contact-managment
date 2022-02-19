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
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
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
    <h3>Login Here !!</h3>
    </div>
    
  <div class="card-body">
  
  
    <form action="LoginServlet" method="post" onsubmit="return loginvalidate()">
   
    
  <div class="mb-3">
    <label class="form-label">Email address</label>
    <input type="email" id="log_email" name="email"  class="form-control" >
    <div id="log_email_error_msg" class="invalid-feedback">
         
        </div>
  </div>
  
  <div class="mb-3">
    <label  class="form-label">Password</label>
    <input type="password" id="log_password" name="password" class="form-control" >
    <div id="log_password_error_msg" class="invalid-feedback">
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