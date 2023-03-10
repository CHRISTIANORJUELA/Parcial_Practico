<%@ page import="com.example.almacen.models.ReceiptJewel" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/6/2023
  Time: 8:01 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link rel="stylesheet" href="css/obtenerDatos.css">
    <title>Title</title>
</head>
<body>
<% ReceiptJewel receiptJewels = (ReceiptJewel) request.getSession().getAttribute("receiptJewel");

%>
<div class="div-main-information">
    <div>
        <h1> Nombre del Cliente : <%= receiptJewels.getNameJewel()%></h1>
    </div>
    <div>
        <h1>Precio de la compra : <%= receiptJewels.getPriceJewel()%></h1>
    </div>
    <div>
        <h1>Fecha de la compra : <%= receiptJewels.getLocalDate()%></h1>
    </div>
</div>

<div class="div-send-finalPage">
    <form action="/obtenerDatos-Servlet" method="get">
        <button type="submit"><span class="material-symbols-outlined eye">visibility</span></button>
    </form>
</div>
</body>
</html>
