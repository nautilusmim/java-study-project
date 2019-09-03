<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.it315.org/taglib" prefix="it315" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>只允许超链接方式访问本站的当前页面</title>
</head>
<body>
	<it315:validate url="html/visitor.html" />
	合法跳转链接可显示这段文字！
</body>
</html>