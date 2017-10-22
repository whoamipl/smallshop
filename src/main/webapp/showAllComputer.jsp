<%@page import="com.example.servletjspdemo.domain.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<jsp:useBean id="computer" class="com.example.servletjspdemo.domain.Computer" scope="session" />
<%
   java.util.Map<Integer, com.example.servletjspdemo.domain.Computer> computers = storage.getShopDb();
   for(com.example.servletjspdemo.domain.Computer c : computers.values()) {
        out.println(c + "<br/>");
        out.println(c.getModel() + "</br>");
        out.println(c.getRam() + "<br/>");
        out.println(c.getCpu() + "<br/>");
        out.println(c.getHdd() + "<br/>");
        out.println(c.getGpu() + "<br/>");
        out.println("<hr>");
   }
%>
<p>
  <a href="getComputerData.jsp">Add another person</a>
</p>

</body>
</html>