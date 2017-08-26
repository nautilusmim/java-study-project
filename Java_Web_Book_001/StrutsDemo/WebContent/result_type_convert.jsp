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
	<!-- Example 6-1:
	<center>
		<h3>struts 2 list type conversion</h3>
		<table>
			<tr>
				<th></th>
				<th>first:</th>
				<th>second:</th>
			</tr>
			<tr>
				<td>Name:</td>
				<td><s:property value="users[0].name" /></td>
				<td><s:property value="users[1].name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><s:property value="users[0].age" /></td>
				<td><s:property value="users[1].age" /></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><s:property value="users[0].tel" /></td>
				<td><s:property value="users[1].tel" /></td>
			</tr>
		</table>
	</center>
	<hr/>
	<center>	
		<h3>struts 2 map type conversion</h3>
		<table>
			<tr>
				<th></th>
				<th>first:</th>
				<th>second:</th>
			</tr>
			<tr>
				<td>Name:</td>
				<td><s:property value="userMaps['first'].name" /></td>
				<td><s:property value="userMaps['second'].name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><s:property value="userMaps['first'].age" /></td>
				<td><s:property value="userMaps['second'].age" /></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><s:property value="userMaps['first'].tel" /></td>
				<td><s:property value="userMaps['second'].tel" /></td>
			</tr>
		</table>
	</center>
	-->
	<s:property value="line" />
</body>
</html>