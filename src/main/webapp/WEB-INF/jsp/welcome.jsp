<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<h2>Welcom to Court Reservation System</h2><%-- ${requestScope.day} --%>
Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />.
<hr />
Handling time: ${handlingTime} ms
</body>
</html>