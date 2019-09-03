<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.it315.org/taglib" prefix="it315" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎访问本页面</title>
</head>
<body>
	<%
		String user = request.getParameter("username");
		if(null != user) {
			session.setAttribute("user", user);
		}
	%>
	欢迎您访问本站！
	<it315:displayUserInfo>
		<br />你的姓名是${ user }
	</it315:displayUserInfo>
</body>
</html>