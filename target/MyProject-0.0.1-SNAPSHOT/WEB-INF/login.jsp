<%@page import="java.io.Writer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	   <%
		    Object msg = request.getAttribute("msg");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        username = username==null?"":username;
	        password = password==null?"":password;
		    if (msg == null) {
				msg = "当前未登录，请登陆后继续";
		    };
		    
		%>

	<h1><%=msg%></h1>
	<form action="login">

		<label>登录账号：</label><input type="text" name="username" value="<%=username %>" /> <label>登录密码：</label><input
			type="text" name="password" value="<%=password%>"/>

		<button type="submit">登录</button>
	</form>



</body>
</html>