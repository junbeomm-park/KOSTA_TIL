<%@page import="kosta.bean.BoardDao"%>
<%@page import="kosta.bean.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	
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
	BoardDao dao = BoardDao.getInstance();
	int re = dao.insertBoard(board);

	if(re != -1){
		out.println("글쓰기 성공");
	}else{
		out.println("글쓰기 실패");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>