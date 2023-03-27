<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; 
	charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Demo</title>
</head>
<body>

	<%!List list = new ArrayList();%>
	<%
	list.add(1);
	list.add(2);
	%>
	<%=list%>

</body>
</html>