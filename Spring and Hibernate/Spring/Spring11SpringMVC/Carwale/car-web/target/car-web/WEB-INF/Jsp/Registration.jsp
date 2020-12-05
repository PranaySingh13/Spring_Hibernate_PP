<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="?language=en_US">English</a>|
<a href="?language=hi_IN">Hindi</a>|
<a href="?language=zh_CN">Chinese</a>
<form:form method="POST" modelAttribute="userObjectR" action="ShowRegistration.do">
<table>
	<tr>
		<td>
			<div>
				<p><spring:message code="form.registration.firstname" /></p><form:input path="firstName"/>
			</div>
		</td>
		<td><form:errors path="firstName"></form:errors></td>
	</tr>
	
	<tr>
		<td>
			<div>
				<p><spring:message code="form.registration.lastname" /></p><form:input path="lastName"/>
			</div>
		</td>
		<td><form:errors path="lastName"></form:errors></td>
 	</tr>
	
	<tr>
		<td>
			<div>
				<p><spring:message code="form.registration.contact"  /></p><form:input path="contact"/>
			</div>
		</td>
 		<td><form:errors path="contact"></form:errors></td>
 		</tr>
	
	<tr>
		<td>
			<div>
				<p><spring:message code="form.registration.Username" /></p><form:input path="email" />
			</div>
		</td>
 		<td><form:errors path="email"></form:errors></td>
	</tr>
	
	<tr>
		<td>
			<div>
				<p><spring:message code="form.registration.Password" /></p><form:password path="password" />
			</div>
		</td>
 		<td><form:errors path="password"></form:errors></td>
	</tr>
	
	<tr>
        <td colspan="2"><input type="submit" value=<spring:message code="form.registration.Submit" /> /></td>
    </tr>
</table>
</form:form>
</body>
</html>