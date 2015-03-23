<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/struts-tags" prefix="s"%>

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

<%-- 
<s:form action="login">
	<s:textfield name="username" label="User Name" />
	<s:textfield name="password" label="Password" />
	<s:submit />
</s:form> 
--%>

	<s:form action="addUser">
		<s:textfield name="username" label="User Name" />
		<s:textfield name="password" label="Password" />
		<s:textfield name="email" label="Email" />
	<s:submit />
</s:form>

<%-- <s:form action="searchUser" align="center">
	<s:textfield name="username" label="Search username"></s:textfield>
	<s:submit />
</s:form>
 --%>
<s:if test="userList.size() > 0">
	<div class="content">
	<table class="userTable" cellpadding="5px">
		<tr class="even">
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<s:iterator value="userList" status="userStatus">
			<tr
				class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="user_id" /></td>
				<td><s:property value="username" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="password" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
</body>
</html>

