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
	<!-- Example 6-4 -->
	<center>
		<h3><s:text name="welcome" /></h3>
		<s:form action="diversify" namespace="/i18n">
			<s:textfield name="name" key="name" />
			<s:textfield name="age" key="age" />
			<s:textfield name="tel" key="tel" />
			<s:textfield name="addr" key="addr" />
			<s:submit key="submit" />
		</s:form>
	</center>
</body>
</html>