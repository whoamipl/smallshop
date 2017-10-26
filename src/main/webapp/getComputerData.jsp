<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<title>Insert title here</title>
<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
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
	<form action="addComputer.jsp">
      MODEL : <input type="text" name="model" required/>
      CPU   : <input type="text" name="cpu" required />
      GPU   : <input type="text" name="gpu" required/>
      RAM   : <input type="text" name="ram" required/>
      HDD   : <input type="text" name="hdd" required/>
      PRICE : <input type="text" name="price" required/>
      <input type="submit" value=" OK ">
    </form>
</body>
</html>