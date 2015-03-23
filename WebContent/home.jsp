<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<style>
#bo
{
	font-size: 30px;
	text-align: center;
	background-color: #A4A4A4;
	padding-top: 15px;
	padding-bottom: 15px;
}

#twe
{
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>

<body>
<div id="bo">
Welcome 
<%
String username = request.getParameter("username");
out.println(username); 
%>
</div>

<div id="twe">
<s:form action="putMessage">
<s:textarea name="message" label="Enter the tweet: "></s:textarea>
<s:submit />
</s:form>
</div>

<s:form action="searchUser" align="center">
	<s:textfield name="username" label="Search username"></s:textfield>
	<s:submit />
</s:form>

<s:if test="tweetList.size() > 0">
	<table class="userTable" cellpadding="5px">
		<tr>			
			<th>Name</th>
			<th>Message</th>	
			<th>Follow User</th>
		</tr> 

 		<s:iterator value="tweetList" status="rowStatus">
			<tr class = "even">
				<td><s:property value="username" /></td>
				<td><s:property value="message" /></td>
				<td><a href="">Follow</a></td>
			</tr>
		</s:iterator>
	</table>
</s:if>

</body>
</html>