<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" modelAttribute="proObject" action="addProduct.do">
<table>
	<tr>
		<td>
			<div>
				<p><spring:message code="form.product.name" /></p><form:input path="productName" />
			</div>
		</td>
		<td><form:errors path="productName"></form:errors></td>
	</tr>
	<tr>
		<td>
			<div>
				<p><spring:message code="form.product.description" /></p><form:input path="productDescription" />
			</div>
		</td>
		<td><form:errors path="productDescription"></form:errors></td>
	</tr>
	<tr>
		<td>
			<div>
				<p><spring:message code="form.product.price" /></p><form:input path="productPrice" />
			</div>
		</td>
		<td><form:errors path="productPrice"></form:errors></td>
	</tr>
	<tr>
	<tr>
		<td>
			<div>
				<p><spring:message code="form.product.dateOfIssue" /></p><form:input path="dateOfIssue" />
			</div>
		</td>
		<td><form:errors path="dateOfIssue"></form:errors></td>
	</tr>
	<tr>
        <td colspan="2"><input type="submit" value=<spring:message code="form.product.Submit" /> /></td>
    </tr>
</table>
</form:form><br>
<table>
 <c:forEach items="${getAllProduct}" var="prod"> 
 <tr>
 <td><c:out value="${prod.productName}"/></td> 
 <td><c:out value="${prod.productDescription}"/></td>
 <td><c:out value="${prod.productPrice}" /></td>
 <td><c:out value="${prod.dateOfIssue}"/></td>
 </tr>
 </c:forEach>
 </table> 
</body>
</html>