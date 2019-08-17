<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department form</title>
</head>
<body>
	<form:form action="submitDepartment" method="post" modelAttribute="department">
	 Enter Department Id:<form:input  path="departmentId"/>
	   <font color="red"> <form:errors path="departmentId"></form:errors></font><br/>
	   Enter Department Name:<form:input  path="departmentName"/>
	   <font color="red"> <form:errors path="departmentName"></form:errors></font><br/>
	   <input type="submit">
  </form:form>


</body>
</html>