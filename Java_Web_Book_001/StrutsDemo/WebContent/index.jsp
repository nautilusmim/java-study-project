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
	<hr />
	<!-- Example 5-2 -->
	<center>
		<s:a action="login">login</s:a> <br />
		<s:a action="login!redirect">login-direct</s:a> <!-- This is DMI. -->
	</center>
	<hr />
	<!-- Example 5-3 -->
	<center>
		<s:a action="user/user">user</s:a> <br />
		<s:a action="user/user!update">update</s:a> <!-- This is DMI. -->
	</center>
	<hr />
	<!-- Example 5-4 -->
	<center>
		<s:a action="servlet">Action with Servlet API(ActionContext)</s:a> <br />
		<s:a action="servlet_aware">Action with Servlet API(*Aware)</s:a> <br />
		<s:a action="servlet_object">Action with Servlet API(ServletActionContext)</s:a>
	</center>
	<hr />
	<!-- Example 5-5 -->
	<center>
		<s:form action="model_driven" method="POST" namespace="/">
			<s:textfield label="姓名" name="name" />
			<s:textfield label="年龄" name="age" />
			<s:textfield label="地址" name="address" />
			<s:textfield label="电话" name="telephone" />
			<s:submit value="submit" />
		</s:form>
	</center>
	<hr />
	<!-- Example 5-6 -->
	<center>
		<s:form action="handle_exception" namespace="/">
			<s:textfield label="姓名" name="name" />
			<s:textfield label="年龄" name="age" />
			<s:textfield label="电话" name="telephone" />
			<s:submit value="submit" />
		</s:form>
	</center>
</body>
</html>