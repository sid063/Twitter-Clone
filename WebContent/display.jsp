<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>

<h1>Display page</h1>

<s:if test="userList.size() > 0">
	<div class="content">
	<table class="userTable" cellpadding="5px">
		<tr>			
			<th>Name</th>
			<th>Password</th>	
			<th>Email</th>
			<th>Follow User</th>
		</tr> 

 		<s:iterator value="userList" status="rowStatus">
			<tr class = "even">
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="email" /></td>
				<td><a href="">Follow</a></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>

</body>
</html>

