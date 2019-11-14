<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Akanksha</title>
</head>
<body>
<img src="img/b.jpg" height="40%" width="50%">
${var1}
<br>
${var2}
<hr>
<%
String name=(String)request.getAttribute("var1");
String address=(String)request.getAttribute("var2");
%>
<%=name %>
<br>
<%=address %>
</body>
</html>