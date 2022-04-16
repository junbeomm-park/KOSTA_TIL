<%@page import="kosta.bean.BoardDao2"%>
<%@page import="kosta.bean.Board"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//request.setCharacterEncoding("utf-8");
	
	//폼에서 데이터를 받아서 Board객체로 전달
	/* Board board = new Board();
	board.setTitle(request.getParameter("title"));
	board.setWriter(request.getParameter("writer"));
	board.setContents(request.getParameter("contents")); */
	
	//Java => Action Tag 대신

%>

<jsp:useBean id="board" class="kosta.bean.Board"/>
<jsp:setProperty property="*" name="board"/>

<%
	BoardDao2 dao = BoardDao2.getInstance();
	int re = dao.insertBoard(board);

/* 	if(re != -1){
		response.sendRedirect("list.jsp");
	}else{
		out.println("글쓰기 실패");
	} */
%>
<c:set var="result" value="<%= re %>"/>
<c:if test="${result != -1 }">
	<c:redirect url="list.jsp"/>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>