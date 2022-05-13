<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: #ff0000;
	}
</style>
</head>
<body>
<h3>글쓰기</h3>
<hr>
<form:form action="member_insert" method="post"
			commandName="memberCommand">
	아이디 : <form:input type="text" path="id"/>
			<form:errors path="id" cssClass="error"/><br>
	비밀번호 : <form:input type="text" path="pass"/>
			<form:errors path="pass" cssClass="error"/><br>
	이름 : <form:input type="text" path="name"/>
			<form:errors path="name" cssClass="error"/><br>
	이메일 : <form:input type="text" path="email"/>
			<form:errors path="email" cssClass="error"/><br>
	나이 : <form:input type="text" path="age"/>
			<form:errors path="age" cssClass="error"/><br>				
	
	<input type="submit" value="등록">
</form:form>
</body>
</html>








