<%-- 
    Document   : registro
    Created on : 19-abr-2016, 22:44:59
    Author     : AlbertoR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
    </head>
    <body>
        <h1>Registrarme</h1>
        <form action="nuevousuario" method="POST">
            <label>Nombre de Usuario</label>
            <input type="text" name="usuario"/><br>
            <label>Contraseña</label>
            <input type="text" name="password"/><br>
            <label>Primer Nombre</label>
            <input type="text" name="nombre"/><br>
            <label>Primer Apellido</label>
            <input type="text" name="apellido"/><br>
            <input type="submit" value="Registrarme"/>
        </form>
    </body>
</html>
