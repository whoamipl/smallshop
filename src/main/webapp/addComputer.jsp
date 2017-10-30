<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product list</title>
  <style type="text/css">
    body {
      background-color: #1c4150;
      color: #e8ecee;
    }
    #topdiv{
      margin-left: auto;
      margin-right: auto;
      position: absolute;
    }
    .tabs {
      margin: 5px;
      display: inline-block;
      height: 50px;
      width: 100px;
      background-color: #32546c;
      border: 2px solid #8da0ad;
      float: left;
      text-align: center;
    }
    a {

      text-decoration: none;
      color: #e8ecee;
    }
    a:visited {
      color: #e8ecee;
    }
    form {
      position: relative;
      top:65px;
    }
    input {
      background-color:#32546c;
      border: 2px solid #8da0ad;
      margin: 2px;
      display: block;
    }
  </style>
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
  response.sendRedirect("/smallshop/showAllComputer.jsp");
%>
</body>
</html>