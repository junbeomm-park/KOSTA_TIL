<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="kosta.bean.Search"%>
<%@page import="kosta.bean.Board"%>
<%@page import="java.util.List"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//request.setCharacterEncoding("utf-8");
/* 	Search search = new Search();
	search.setArea(request.getParameterValues("area"));
	search.setSearchKey("%" + request.getParameter("searchKey") + "%"); */

	Map map = new HashMap();
	map.put("area", request.getParameterValues("area"));
	map.put("searchKey", "%" + request.getParameter("searchKey") + "%");

	BoardDao2 dao = BoardDao2.getInstance();
	List<Board> list = dao.listBoard(map);
	
	request.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insert_form.jsp">글쓰기</a>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일자</td>
			<td>조회수</td>
		</tr>
<%-- 		<% for(int i = 0; i < list.size(); i++) { 
				Board board = list.get(i);
		%>
		<tr>
			<td><%= board.getSeq() %></td>
			<td><a href="detail.jsp?seq=<%= board.getSeq() %>"><%= board.getTitle() %></a></td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegdate() %></td>
			<td><%= board.getHitcount() %></td>
		</tr>
		<%} %> --%>
		
		<c:forEach var="p" items="${list }">
			<tr>
				<td>${p.seq }</td>
				<td><a href="detail.jsp?seq=${p.seq}">${p.title }</a></td>
				<td>${p.writer }</td>
				<td>
					<fmt:parseDate var="dt" value="${p.regdate }" pattern="yyyy-MM-dd HH:mm:ss"/>
					<fmt:formatDate value="${dt }" pattern="yyyy/MM/dd"/>
				</td>
				<td>${p.hitcount }</td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	
	<form action="list.jsp" method="get">
		<input type="checkbox" name="area" value="title"> 제목
		<input type="checkbox" name="area" value="writer"> 작성자
		<input type="text" name="searchKey" size="10">
		<input type="submit" value="검색">
	</form>
</body>
</html>