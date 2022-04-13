<%@page import="kosta.bean.BoardDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="kosta.bean.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="board" class="kosta.bean.Board"/>
<jsp:setProperty property="*" name="board"/>
<%
	BoardDao dao = BoardDao.getInstance();
	int re = dao.update(board);
	
	if(re > 0){
		response.sendRedirect("list.jsp");
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