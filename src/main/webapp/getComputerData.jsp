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
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body {
	background-color: #1c4150;
	color: #e8ecee;
}
#topdiv{
	margin-left: auto;
	margin-right: auto;
	float: none;
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

</style>
</head>
<body>
	<div id="topdiv">
	<div class="tabs"><a href='/shoppingcard'>Shopping Card</div>
	<div class="tabs"><a href='/addComputer.jsp'>Add Computer</div>
	<div class="tabs"><a href='/shop'>Shop</a></div>
	<div/></br>
	<form action="addComputer.jsp">
      Model : <input type="text" name="model" required /><br />
      CPU   : <input type="text" name="cpu" required /><br />
      GPU   : <input type="text" name="gpu" required/><br />
      RAM   : <input type="text" name="ram" required/><br />
      HDD   : <input type="text" name="hdd" required/><br />
      <input type="submit" value=" OK ">
    </form>
</body>
</html>