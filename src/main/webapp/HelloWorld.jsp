<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <h2>Hello World</h2>
        <%
            out.println("Today is Wed 16 2017");
            com.example.servletjspdemo.web.Counter counter = (com.example.servletjspdemo.web.Counter) session.getAttribute("countSes");
            out.println(counter);
        %>
    </body>
</html>