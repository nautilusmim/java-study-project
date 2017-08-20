<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> <!-- add struts tag library -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:a action="hello">Hello</s:a>
	
	<!-- Example 5-2 -->
	<center>
		<s:a action="login">login</s:a> <br />
		<s:a action="login!redirect">login-direct</s:a> <!-- This is DMI. -->
	</center>
</body>
</html>