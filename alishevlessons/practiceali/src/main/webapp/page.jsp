<%--
  Created by IntelliJ IDEA.
  User: andry
  Date: 6.12.20
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page</title>
</head>
<body>
<h1>Hi, <%= request.getSession().getAttribute("name") %> </h1>
<p>
    <%= request.getAttribute("adminInfo") %>
</p>

<a href="/home">Log out</a>
</body>
</html>
