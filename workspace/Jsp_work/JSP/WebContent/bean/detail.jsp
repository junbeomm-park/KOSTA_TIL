<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li><%= board.getSeq() %></li>
	<li><%= board.getTitle() %></li>
	<li><%= board.getWriter() %></li>
	<li><%= board.getContents() %></li>
	<li><%= board.getHitcount() %></li>

</ul>
<br>

<a href="updateForm.jsp?seq=<%=seq%>">글수정</a>
<a href="deleteProc.jsp?seq=<%=seq%>">글삭제</a>

</body>
</html>