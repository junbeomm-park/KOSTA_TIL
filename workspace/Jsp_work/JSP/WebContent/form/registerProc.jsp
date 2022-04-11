<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String arr[] = request.getParameterValues("hobby");
	
	request.setAttribute("name", name);
	request.setAttribute("address", address);
	request.setAttribute("hobby", arr);
	
%>

	<jsp:forward page="result.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>