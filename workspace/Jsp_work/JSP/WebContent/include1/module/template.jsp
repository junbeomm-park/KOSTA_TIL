<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String body = request.getParameter("body");
	if(body == null){
		body = "/include1/main.jsp";
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<hr>

	<jsp:include page="menu.jsp"></jsp:include>
	<hr>
	<h2>body 페이지</h2>
	<jsp:include page="<%= body %>"></jsp:include>
	<hr>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>