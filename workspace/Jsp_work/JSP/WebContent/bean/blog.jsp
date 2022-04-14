<%@page import="kosta.bean.Blog"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	BoardDao2 dao = BoardDao2.getInstance();
 	Blog blog = dao.selectBlog("1"); 
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>블로그내용</h3>
	<ul>
		<li>blog id: <%=blog.getId() %></li>
		<li>blog title: <%=blog.getTitle() %></li>
		<li>blog content: <%=blog.getContent() %></li>
		<li>blog author_id: <%=blog.getAuthor().getAuthor_id() %></li>
		<li>blog author name: <%=blog.getAuthor().getName() %></li>
		<li>blog author address: <%=blog.getAuthor().getAddress() %></li>
	</ul>
</body>
</html>












