<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<style>
#d{
	position: absolute;
	width:400px; margin:0 auto;
	top: 20%;
	left: 30%;
	background-color: #D8D8D8;
/* 	height: 250px; */
	border-style: solid;
	border-width: 1px;
/* 	padding-top: 75px;*/
	padding-bottom: 25px;
	padding-left: 150px;
 }
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>

<div id="d">
<s:form action="login">
	<s:textfield name="username" label="User Name" />
	<s:password name="password" label="Password" />
	<s:submit align="center" />
</s:form>
&nbsp;&nbsp;&nbsp;&nbsp;<a href="register.jsp">New User?</a>&nbsp;&nbsp;&nbsp;
<a href="forgot.jsp">Forgot password?</a>
</div>
</body>
</html>
