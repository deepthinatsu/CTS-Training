<%@ page import="com.login.model.LoginPojo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		LoginPojo loginPojo = (LoginPojo) request.getAttribute("loginDetails");
	%>
	<%--  <%
 
 String user = request.getParameter("user");
/*  String resultData = (String)request.getAttribute("result");
 if(resultData.equals("success")){
	 out.println("<h2><font color='green'>Login Successful!</font></h2>");
 }
	 else{
		 out.println("<h2><font color='red'>Login Failure!</font></h2>");
	 }
 
  */
 
 %>
  <h2><font color='green'>Welcome <%=user%>!! Login Successful!!</font></h2>
 --%>
	<h3>
		<font color='green'>Welcome<%=loginPojo.getRole()%>, <%=loginPojo.getUserName()%> </font>
	</h3>
</body>
</html>