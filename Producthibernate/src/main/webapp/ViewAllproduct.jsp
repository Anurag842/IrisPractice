<%@page import="java.util.List,com.hibernate.entities.Product" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<table border="1">
	<tr>
			<th>Product Id</th>
			
			<th>Product Name</th>
			<th>Quantity</th>
			<th>Price</th>
			
		</tr>
		
	<c:forEach items="${eList}" var="p">
			<tr>
				<td>${p.productId}</td>
				<td>${p.productName}</td>
				<td>${p.quantity}</td>
				<td>${p.price}</td>
				
			</tr>
		</c:forEach>
</table>
