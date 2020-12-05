<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width=100% align="center" >
	<tr>
		<td colspan="2" align="center"><tiles:insertAttribute name="header" /></td>
	</tr>
	
	<tr>
		<td align="center" bgcolor="#FFC266"><tiles:insertAttribute name="body" /></td>
	</tr>
	
	<tr>
		<td colspan="2" align="center"><tiles:insertAttribute name="footer" /></td>
	</tr>

</table>
</body>
</html>