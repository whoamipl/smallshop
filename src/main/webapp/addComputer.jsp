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

<form action="addComputer.jsp">

  Model : <input type="text" name="model" value="${computer.model}" required /><br />
  CPU   : <input type="text" name="cpu" value="${}" required /><br />
  GPU   : <input type="text" name="gpu" value="${person.firstName}" required/><br />
  RAM   : <input type="text" name="ram" value="${person.firstName}" required/><br />
  HDD   : <input type="text" name="hdd" value="${person.firstName}" required/><br />
  <input type="submit" value=" OK ">
</form>

</body>
</html>