<%@page import="com.example.servletjspdemo.domain.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<jsp:useBean id="computer" class="com.example.servletjspdemo.domain.Computer" scope="session" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
	<div id="topdiv">
	<div class="tabs"><a href='/smallshop/shoppingcard'>Shopping Card</div>
	<div class="tabs"><a href='/smallshop/getComputerData.jsp'>Add Computer</div>
	<div class="tabs"><a href='/smallshop/shop'>Shop</a></div>
	<div/>
    <form action="/shoppingcard">
	  <%

	     java.util.Map<Integer, com.example.servletjspdemo.domain.Computer> computers = storage.getShopDb();
         for(com.example.servletjspdemo.domain.Computer c : computers.values()) {
          out.println("<label>" + c.getModel() + " " + c.getCpu() + " " + c.getGpu() + "<input " +
                                 "type=\"checkbox\" value=\"\"/></label>");
                     }
      %>
      <input type="submit" value="Add to card"/></input>
     </form>
</body>
</html>
