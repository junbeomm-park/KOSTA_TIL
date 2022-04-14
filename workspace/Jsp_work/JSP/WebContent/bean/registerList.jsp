<%@page import="kosta.bean.Member"%>
<%@page import="java.util.List"%>
<%@page import="kosta.bean.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	MemberDao dao = MemberDao.getInstance();
	List<Member> list = dao.listMember();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>나이</td>
		</tr>
		<% for(int i = 0; i < list.size(); i++) { 
				Member member = list.get(i);
		%>
		<tr>
			<td><%= member.getId() %></td>
			<td><%= member.getPass() %></td>
			<td><%= member.getName() %></td>
			<td><%= member.getAge() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>