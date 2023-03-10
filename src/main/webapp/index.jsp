<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="css/Index.css" >
    <title>Joyeria</title>
</head>
<body>
<% Map <String,String> wrongs =  (Map<String, String>) request.getAttribute("wrongs");%>
<% %>
<div class="div-general">
    <div class="div-parte1">
        <div class="div-title">
            <h1 style="font-family: Rockwell">Luxury Diamond Joyeria</h1>
        </div>
        <div class="div-general-diamont">
            <div>
                <img src="images/diamante.png" class="img-diamont">
            </div>
        </div>
    </div>
    <div class="div-form">
        <form action="/hello-servlet" method="post">
            <div class="div-father">
                <div class="div-1">
                    <label class="labels">Nombre Completo</label>
                    <input name="name" class="inputs" value="${param.get("name")}">
                </div>
                <div class="div-1">
                    <label class="labels">Seleccione los Quilates</label>
                    <select name="quilates" class="selects">
                        <option></option>
                        <option>14</option>
                        <option>18</option>
                        <option>24</option>
                    </select>
                </div>
                <div class="div-1">
                    <label class="labels">Seleccione el tipo de Joya</label>
                    <select name="jewel" class="selects" >
                        <option></option>
                        <option>Oro</option>
                        <option>Diamante</option>
                        <option>Esmeralda</option>
                        <option>Ruby</option>
                    </select>
                </div>
                <div class="div-1">
                    <label class="labels">Onzas</label>
                    <input type="number" min="0" max="10000" name="ounces" class="inputs" required value="${param.get("ounces")}">
                </div>

                <div class="div-1">
                    <button type="submit" class="btn">Enviar</button>
                </div>
            </div>
        </form>
    </div>


</div>
<% if(wrongs!= null && wrongs.size()>0){
    List<String> message = new ArrayList<>();
    for (String value: wrongs.values()){
        message.add(value+"\n");
    }
    System.out.println("wrongs tamaño : "+wrongs.size());
%>
<div class="div-wrongs">
    <%
        for (String value:message){
    %>
    <p style="color: red"><%=value%></p>
    <%}%>
</div>
<%}%>
</body>
</html>