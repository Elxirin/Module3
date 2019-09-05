<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hai here@@@
<table>
					<tr>
						<th>${employee.employeeId}</th>
						<th>${employee.firstName}</th>
						<th>${employee.lastName}</th>
						<th>${employee.designation}</th>
						<th>${employee.salary}</th>
					</tr>
</table>
</body>
</html>