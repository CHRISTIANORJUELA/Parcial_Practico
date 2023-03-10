<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/8/2023
  Time: 1:12 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/finalPage.css">
    <title>Numero de compras</title>
</head>
<body style="background-color: #0e429f">
<%int numberSell = (int) request.getSession().getAttribute("stockSell"); %>
<div style="background-color: royalblue; padding: 30px; border-radius: 10px">
  <h2 style="font-family: 'Calibri Light'">numero de compras hasta el momento : <%=numberSell%></h2>
</div>
</body>
</html>
