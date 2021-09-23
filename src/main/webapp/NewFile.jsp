<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Login </h1>
	<form action="/users/login/abc,123" method="GET">

	<table>
		<tr>
	    	<td>loginId</td>
	    	<td><input type="text" name = 'loginId' value=''></td>
    	</tr>

    	<tr>
	    	<td>Password</td>
	    	<td><input type= "password" name ='pwd' value=''></td>
    	</tr>
    	<tr>
	    
	    	<td><input type="Submit" name = 'submit' value='submit'></td>
    	</tr> 
    </table>
</form>

</body>
</html>