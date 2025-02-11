<%@page import="com.sri.model.webdemo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESULT</title>
</head>
<body bgcolor="blue"><font size="7">
<font color="black">

	<% 
	webdemo wd = (webdemo) request.getAttribute("webdemo");
	out.println(wd);
	%>
	</font></font>
</body>
</html>
