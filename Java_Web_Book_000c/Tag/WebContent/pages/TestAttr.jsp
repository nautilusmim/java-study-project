<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.it315.org/taglib" prefix="it315" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test user defined tag - dynamic attribute value</title>
</head>
<body>
	<it315:testAttr attr="<%= new java.util.Date() %>" />
</body>
</html>