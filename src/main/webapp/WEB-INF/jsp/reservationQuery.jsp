<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation Query</title>
</head>
<body>
<form method="post">
Court Name
<input type="text" name="courtName" value="${courtName}" />
<input type="submit" value="Query" />
</form>
<table border="1">
	<tr>
		<th>Court Name</th>
		<th>Date</th>
		<th>Hour</th>
		<th>Player</th>
	</tr>
	<c:forEach items="${reservations}" var="reservation">
	<tr>
		<td>${reservation.courtName}</td>
		<td><fmt:formatDate value="${reservation.date}" pattern="yyyy-MM-dd" /></td>
		<td>${reservation.hour}</td>
		<td>${reservation.player.name}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>