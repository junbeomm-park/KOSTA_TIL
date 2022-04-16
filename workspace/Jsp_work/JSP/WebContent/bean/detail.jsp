<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 글번호 받기 String -> int
	BoardDao 객체 구하기
	BoardDao detailBoard() 호출
	결과값을 화면에 적절히 출력 -->    

<%
	int seq = 1;
	if(request.getParameter("seq") != null){
		seq = Integer.parseInt(request.getParameter("seq"));
	}
	
	BoardDao2 dao = BoardDao2.getInstance();
	Board board = dao.detailBoard(seq);
	
	request.setAttribute("board", board);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>${board.seq }</li>
	<li>${board.title }</li>
	<li>${board.writer }</li>
	<li>${board.contents }</li>

</ul>
<br>

<a href="updateForm.jsp?seq=${board.seq }">글수정</a>
<a href="deleteProc.jsp?seq=<%=seq%>">글삭제</a>

</body>
</html>