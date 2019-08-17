<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee form</title>
</head>
<body>
	<form:form action="submitEmployee" method="post" modelAttribute="employee">
	 Enter Employee Id:<form:input  path="employeeId"/>
	   <font color="red"> <form:errors path="employeeId"></form:errors></font><br/>
	   Enter Employee Name:<form:input  path="employeeName"/>
	   <font color="red"> <form:errors path="employeeName"></form:errors></font><br/>
	   Enter email :<form:input path="email"/>
	   <font color="red"><form:errors path="email"></form:errors></font><br/>
	   Enter contact :<form:input path="contact"/>
	   <font color="red"><form:errors path="contact" ></form:errors></font><br/>
	   <input type="submit">
  </form:form>


</body>
</html>