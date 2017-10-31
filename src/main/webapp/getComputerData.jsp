<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Add product</title>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div id="topdiv">
        <div class="tabs"><a href='/smallshop/shoppingcard'>Shopping Card</a></div>
        <div class="tabs"><a href='/smallshop/getComputerData.jsp'>Add Computer</a></div>
	<div class="tabs"><a href='/smallshop/showAllComputer.jsp'>Shop</a></div>
	<div/>
	<form action="addComputer.jsp">
      MODEL : <input type="text" name="model" required/><br/>
      CPU   : <input type="text" name="cpu" required /><br/>
      GPU   : <input type="text" name="gpu" required/><br/>
      RAM   : <input type="text" name="ram" required/><br/>
      HDD   : <input type="text" name="hdd" required/><br/>
      PRICE : <input type="text" name="price" required/><br/>
      <input type="submit" value=" OK ">
    </form>
</body>
</html>