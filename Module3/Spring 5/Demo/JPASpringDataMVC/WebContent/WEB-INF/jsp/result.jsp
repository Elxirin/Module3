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
	<div>
		<h1>Employee Directory</h1>
	<c:if test="${param.message ne null}">
			<div>
				${param.message}
			</div>
		</c:if>
		
		<h3>Current List of Employees:</h3>
		<c:if test="${empList ne null}">
			<table>
				<tr>
					<th>EmployeeID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Designation</th>
					<th>Salary</th>
				</tr>
				<c:forEach items="${empList}" var="employee">
					<tr>
						<th><a href="view.html?id=${employee.employeeId}">${employee.employeeId}</a></th>
						<th> ${employee.firstName}</th>
						<th>${employee.lastName}</th>
						<th>${employee.designation}</th>
						<th>${employee.salary}</th>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>