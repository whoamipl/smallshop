<%@ page import="java.util.Map" %>
<%@ page import="java.util.Collections" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product list</title>
</head>
<body>
<div>
    <div class="tabs" style="display: inline-block; border: solid 1px #000; text-decoration: none;"><a href='/smallshop/shoppingcart'>Shopping Card</a></div>
    <div class="tabs" style="display: inline-block; border: solid 1px #000; text-decoration: none;"><a href='/smallshop/getComputerData.jsp'>Add Computer</a></div>
    <div class="tabs" style="display: inline-block; border: solid 1px #000; text-decoration: none;"><a href='/smallshop/showAllComputer.jsp'>Shop</a></div>
    <div/>
<%
    com.example.servletjspdemo.domain.Computer c = storage.findComputerByModel(request.getParameter("model"));
    if ( c == null) {
        storage.addComputer(request.getParameter("model"), Integer.parseInt(request.getParameter("ram")), request
                        .getParameter("cpu"),
                Integer.parseInt(request.getParameter("hdd")), request.getParameter("gpu"), Double.parseDouble
                        (request.getParameter("price")),1);
        response.sendRedirect("/smallshop/showAllComputer.jsp");
    } else {
        c.incrementAmount();
        response.sendRedirect("/smallshop/showAllComputer.jsp");
    }
%>
</body>
</html>