<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글세부보기</h2>
	<ul>
		<li>${board.seq }</li>
		<li>${board.title }</li>
		<li>${board.writer }</li>
		<li>${board.contents }</li>
		<li><a href="/MVC/download.jsp?filename=${board.fname}">${board.fname }</a></li>
	</ul>
	<br>
	<h4>댓글목록</h4>
	<table border="1">
		<tr>
			<td>댓글번호</td>
			<td>댓글제목</td>
			<td>댓글작성자</td>
			<td>댓글내용</td>
			<td>댓글일자</td>
		</tr>
		<c:forEach var="reply" items="${replys }">
			<tr>
				<td>${reply.r_no }</td>
				<td>${reply.r_title }</td>
				<td>${reply.r_writer }</td>
				<td>${reply.r_contents }</td>
				<td>${reply.r_regdate }</td>
			</tr>
		</c:forEach>

	</table>
	
	<form action="insertReplyAction.do" method="post">
		<input type="hidden" name="seq" value="${board.seq }">
		댓글제목 : <input type="text" name="r_title"><br>
		댓글 작성자 : <input type="text" name="r_writer"><br>
		댓글 내용 : <input type="text" name="r_contents"><br>
		<input type="submit" value="댓글쓰기"> 
	</form>

<a href="updateForm.do?seq=${board.seq }">글수정</a>
<%-- <a href="deleteProc.jsp?seq=<%=seq%>">글삭제</a> --%>

</body>
</html>