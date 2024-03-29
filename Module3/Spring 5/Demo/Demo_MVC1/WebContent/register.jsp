<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" modelAttribute="register" action="successRegister.obj">
  Enter First Name:<form:input path="firstName"/>
                  <form:errors path="firstName" cssStyle="color:red"/>  
  <br/>
  Enter Last Name:<form:input path="lastName"/>
  				  <form:errors path="lastName" cssStyle="color:red"/>
  <br/>
  Gender:
  <form:radiobutton path="gender" value="M" label="M" />
  <form:radiobutton path="gender" value="F" label="F" /><br/>
  Enter eMail:<form:input path="email"/>
              <form:errors path="email" cssStyle="color:red"/>
  <br/>
  Select Skills:
  <form:checkboxes items="${skillList}" path="skillSet"/>
  <br/>
  
  Select Your City:
  <form:select path="city"> 
	<form:option value="" label="Please Select"/>
	<form:options items="${cityList}" />
  </form:select>
  <br/>
  <input type="submit" value="Register"/>
</form:form>

</body>
</html>