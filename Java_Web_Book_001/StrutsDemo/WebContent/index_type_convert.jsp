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
	<center>
		<h3>struts 2 list type conversion</h3>
		<s:form action="list_map" namespace="/">
			<table>
				<tr>
					<th></th>
					<th>first:</th>
					<th>second:</th>
				</tr>
				<tr>
					<td>Name:</td>
					<td><s:textfield name="users[0].name" theme="simple" /></td>
					<td><s:textfield name="users[1].name" theme="simple" /></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><s:textfield name="users[0].age" theme="simple" /></td>
					<td><s:textfield name="users[1].age" theme="simple" /></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><s:textfield name="users[0].tel" theme="simple" /></td>
					<td><s:textfield name="users[1].tel" theme="simple" /></td>
				</tr>
			</table>
			<hr/>
			<table>
				<tr>
					<th></th>
					<th>first:</th>
					<th>second:</th>
				</tr>
				<tr>
					<td>Name:</td>
					<td><s:textfield name="userMaps['first'].name" theme="simple" /></td>
					<td><s:textfield name="userMaps['second'].name" theme="simple" /></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><s:textfield name="userMaps['first'].age" theme="simple" /></td>
					<td><s:textfield name="userMaps['second'].age" theme="simple" /></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><s:textfield name="userMaps['first'].tel" theme="simple" /></td>
					<td><s:textfield name="userMaps['second'].tel" theme="simple" /></td>
				</tr>
				<tr>
					<td colspan="3"><s:submit value="submit" /></td>
				</tr>
			</table>
		</s:form>
	</center>
</body>
</html>