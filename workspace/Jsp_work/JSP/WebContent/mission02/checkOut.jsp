<%@page import="kosta.bean.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    
    	List<Product> list = (List)session.getAttribute("productlist");
    	
    /* 	if(list == null){
    		out.println("상품없음");
    	}else{
    		for(String fruit : list){
    			out.println(fruit + "<br>");
    		}
    	} */
    	
    	
    %>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(list == null){
	%>
		<b>선택한 상품이 없습니다.</b>
	<%	}else { %>
		<ul>
	<% 
			int total = 0;
			for(int i = 0; i < list.size(); i++) {
				Product product = list.get(i);
				total += (product.getPrice() * product.getAmount());
	%>
			<li><%= product.getFruit() %> : <%= product.getPrice() %> * <%= product.getAmount() %> = <%= (product.getPrice() * product.getAmount()) %></li>
		<%} %>
		</ul>
		<br>
		주문한 총 금액 : <%= total %> 원
	<%} %>
</body>
</html>