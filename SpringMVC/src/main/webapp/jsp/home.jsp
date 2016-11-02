<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Welcome</title>  
</head>  
<body>  
<h2>Hello World!</h2>  
  
<form action="login">  
UserName: <input id="username" name="username" type="text"></input><br>  
Password: <input id="username" name="password" type="password"></input><br>  
    <input type="submit">  
</form>  
<span>Current IP：<%=request.getRemoteAddr() %></span>  
</body>  
</html>  