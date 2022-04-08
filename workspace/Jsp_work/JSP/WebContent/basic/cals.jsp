<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int num1, num2 = 0;
	String name = "";
	
	request.setCharacterEncoding("utf-8");
	num1 = Integer.parseInt(request.getParameter("num1"));
	num2 = Integer.parseInt(request.getParameter("num2"));
	name = request.getParameter("userName");
	
	int result = num1 + num2;
	
	request.setAttribute("result", result);
	request.setAttribute("userName", name);
	
	//RequestDispatcher re = request.getRequestDispatcher("/basic/result.jsp");
	//re.forward(request, response); 
	
	//Redirect 방식으로 이동(새로운 request발생)
	//response.sendRedirect("result.jsp");
	%>
	
	<jsp:forward page="/basic/result.jsp"/>
	
	
	
	
	
	
	
	
</body>
</html>