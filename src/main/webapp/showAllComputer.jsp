<%@page import="com.example.servletjspdemo.domain.Computer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div>
		<div class="tabs" style="display: inline-block; border: solid 1px #000; text-decoration: none;"><a href='/smallshop/shoppingcart'>Shopping Card</a></div>
		<div class="tabs" style="display: inline-block; border: solid 1px #000; text-decoration: none;"><a href='/smallshop/getComputerData.jsp'>Add Computer</a></div>
	<div class="tabs" style="display: inline-block; border: solid 1px #000; text-decoration: none;"><a href='/smallshop/showAllComputers.jsp'>Shop</a></div>
	<div/>
	  <%
	      java.util.Map<Integer, com.example.servletjspdemo.domain.Computer> computers = storage.getShopDb();
          for (java.util.Map.Entry<Integer, com.example.servletjspdemo.domain.Computer> entry : computers.entrySet()) {
			  out.println("<form action=\"addtocart\">\n" +
			  " \t<p>Model:&nbsp;"+entry.getValue().getModel()+"&nbsp;Cena:&nbsp;"+entry.getValue().getPrice()+"Ilość w magazynie:&nbsp;"+entry.getValue().getAmout()+
			  "  <input type=\"hidden\" name=\"id\" value=\""+entry.getKey()+"\"/>" +
			  "  <input type=\"hidden\" name=\"price\" value=\""+entry.getValue().getPrice()+"\"/>" +
			  "  <input type=\"submit\" value=\"Dodaj do koszyka\">\"\n" +
			  "</form>");
			  }
           out.println("<hr>");

      %>
</body>
</html>
