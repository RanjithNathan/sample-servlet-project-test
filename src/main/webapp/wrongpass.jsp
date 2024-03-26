<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login_page_incorrect_password</title>
<Style>
body{
  text-align: center;
}
</Style>
</head>

<body>
<form action="One"> 

		<legend><h3>Log-In</h3></legend><hr>
		<br>
			UserName: <input type="text" name="username" id="username"  placeholder="username"> 
		<br><br>
	  		Password: <input type="password" name="password" id="password"  placeholder="password">
	  	<br><br>
	    			  <input type="submit" name="submit" id="" > 
	    			 <h4 style="color: red;">You Entered a Wrong Password Or UserName...Please Enter it Correctly</h4>
    			  
  	</form>
</body>
</html>