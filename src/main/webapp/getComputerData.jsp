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