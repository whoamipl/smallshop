<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="computer" class="com.example.servletjspdemo.domain.Computer" scope="session" />

<jsp:setProperty name="computer" property="*" />

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<%
  storage.addComputer(request.getParameter("model"), Integer.parseInt(request.getParameter("ram")),request
  .getParameter("cpu"),
                Integer.parseInt(request.getParameter("hdd")), request.getParameter("gpu"), Double.parseDouble
                (request.getParameter("price")));
%>

<p>Following computers has been added to storage: </p>
<p>
  <a href="showAllComputer.jsp">Show all persons</a>
</p>
</body>
</html>