<%@page import="kosta.bean.Member"%>
<%@page import="kosta.bean.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    	request.setCharacterEncoding("utf-8");
 %>

<jsp:useBean id="member" class="kosta.bean.Member"/>
<jsp:setProperty property="*" name="member"/>

<%
	MemberDao dao = MemberDao.getInstance();
	int re = dao.insertMember(member);
	
	if(re != -1){
		out.println("성공");
	}else{
		out.println("실패");
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