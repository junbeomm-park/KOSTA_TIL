<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String arr[] = (String[])(request.getAttribute("hobby"));
	%>
	<h3>회원가입 내역</h3>
	이름 : ${name }<br>
	주소 : ${address }<br>
	취미 : <%= Arrays.toString(arr) %>
</body>
</html>