<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="board" class="kosta.bean.Board"/>
<jsp:setProperty property="*" name="board"/>
<%-- <%
	BoardDao2 dao = new BoardDao2();
	int re = dao.deleteBoard();
	
	if(re > 0){
		response.sendRedirect("list.jsp");
	}
%> --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>