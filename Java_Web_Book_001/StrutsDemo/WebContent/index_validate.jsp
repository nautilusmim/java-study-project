<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Example 6-3 -->
	<s:form action="validate" namespace="/validate">
		<s:textfield name="name" label="name" />
		<s:textfield name="age" label="age" />
		<s:textfield name="tel" label="telephone" />
		<s:textfield name="addr" label="address" />
		<s:submit value="execute" />
		<s:submit method="log" value="log" />
	</s:form>
</body>
</html>