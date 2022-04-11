<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String m_id = "kosta";
	String m_pass = "1234";
	
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	String m_name = "홍길동";
	String name = URLEncoder.encode(m_name,"utf-8");
	
	if(id.equals(m_id) && pass.equals(m_pass)){ //로그인 성공
		Cookie cookie = new Cookie("name", name);//쿠키 생성
		response.addCookie(cookie); //생성된 쿠키를 클라이언트에 전달
	}else{//로그인 실패
		response.sendRedirect("loginForm.jsp");
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="main.jsp">메인페이지</a>
</body>
</html>