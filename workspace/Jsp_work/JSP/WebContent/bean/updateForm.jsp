<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	int seq = 1;
	if(request.getParameter("seq") != null){
		seq = Integer.parseInt(request.getParameter("seq"));
	}
	
	BoardDao dao = BoardDao.getInstance();
	Board board = dao.detailBoard(seq);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글 수정 폼</h3>
	<form action="updateProc.jsp" method="post">
		<input type="hidden" name="seq" value="<%= board.getSeq()%>">
		작성자 : <%= board.getWriter() %><br>
		제목 : <input type="text" name="title" value="<%= board.getTitle()%>"><br>
		내용 : <br>
		<textarea rows="6" cols="70" name="contents"><%= board.getContents()%></textarea>
		<input type="submit" value="수정완료">
	</form>
</body>
</html>