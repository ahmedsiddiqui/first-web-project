
<%@page import="fileio.MyFIleIO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Input</title>
</head>
<body>

<h1>HELLO WORLD</h1>

<form name="frm" method="get" action="test.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="22%">&nbsp;</td>
    <td width="78%">&nbsp;</td>
    </tr>
  <tr>
    <td>Name Student </td>
    <td><input type="text" name="studentName"></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="submit" value="Submit"></td>
    </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
</table>
</form>

<% 
String line = request.getParameter("studentName");

if(line != null && line.length() > 0){
	MyFIleIO.writeToFile(request.getParameter("studentName"));
}

%>
<%= MyFIleIO.readFile() %>        
</body>
</html>

