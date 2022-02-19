<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
 function validate(){
	 let name=$("#reg_name").val()
	if(name.trim()==''){
		
		$("#reg_name").addClass("is-invalid");
		$("#reg_name_error_msg").text(" Name is Required..");
		return false;
	}
	 
	 let email=$("#reg_email").val()
		if(email.trim()==''){
			
			$("#reg_email").addClass("is-invalid");
			$("#reg_email_error_msg").text(" Email is Required..");
			return false;
		}
	 
	 let password=$("#reg_password").val()
		if(password.trim()==''){
			
			$("#reg_password").addClass("is-invalid");
			$("#reg_password_error_msg").text(" Password is Required..");
			return false;
		}

	 let address=$("#reg_address").val()
		if(address.trim()==''){
			
			$("#reg_address").addClass("is-invalid");
			$("#reg_address_error_msg").text(" Address is Required..");
			return false;
		}
	 
	 let status=$("#reg_status").val()
		if(status.trim()==''){
			
			$("#reg_status").addClass("is-invalid");
			$("#reg_status_error_msg").text(" Status is Required..");
			return false;
		}
	
return true;
	
}
 //login validation here
 function loginvalidate(){
	 
	 let emaill=$("#log_email").val()
		if(emaill.trim()==''){
			
			$("#log_email").addClass("is-invalid");
			$("#log_email_error_msg").text(" Email is Required........");
			return false;
		}
	 
	 let pass=$("#log_password").val()
		if(pass.trim()==''){
			
			$("#log_password").addClass("is-invalid");
			$("#log_password_error_msg").text(" Password is Required........");
			return false;
		}
	return true; 
 }
</script>


<style>
.list-group-item.active {
    background-color: #1abc9c !important;   
}
.list-group-item:hover {
    background-color: #1abc9c !important;   
}

.mycolor {
    
    background-color: #1abc9c !important;
}
.text-center{
text-align=center;
}
</style>