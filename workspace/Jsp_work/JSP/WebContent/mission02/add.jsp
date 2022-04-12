<%@page import="kosta.bean.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%! List<Product> list = new ArrayList<Product>(); %>
    
    <%
    	request.setCharacterEncoding("utf-8");
    %>
    
    <jsp:useBean id="product" class="kosta.bean.Product"/>
    <jsp:setProperty property="*" name="product"/>
    
    <% 
    
    	list = (List)session.getAttribute("productlist");
    	
    	if(list == null){
    		list = new ArrayList<Product>();
    		session.setAttribute("productlist", list);
    	}
    	
    	list.add(product);
    
    %>
    



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="javascript:history.back()">뒤로가기</a>
	<%=product.getFruit() %>
	
</body>
</html>