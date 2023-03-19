<html>
<head>
    <title>Hello World - JSP</title>
</head>
<body>
    <%-- JSP Comment --%>
    <h1>Hello World!</h1>
    <p>
    <%
         out.println("Your IP address is ");
    %>
    <span style="color:red">
        <%= request.getRemoteAddr() %>
    </span>
    </p>
    <%@ page import="java.time.LocalDate" %>
	<%@ page import="java.time.LocalTime" %>
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<p>当前日期：<% out.println(LocalDate.now()); %></p>
	<p>当前时间：<%=LocalTime.now().withNano(0) %></p>
</body>
</html>
