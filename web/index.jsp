<%-- 
    Document   : index
    Created on : 19-abr-2016, 20:53:31
    Author     : AlbertoR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
        <script src="js/menu.js"></script>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action="iniciar" method="POST" id="forminicio">
            <input type="text" name="usuario" placeholder="ususario" id="txtusuario"/><br>
            <input type="password" name="password" placeholder="contraseña" id="txtpassword"/><br>
            <input type="submit" value="Iniciar Sesion" id="btniniciar"/>
        </form>
        <br>
        No tienes una cuenta... <a href="registro.jsp">Registrarme</a>
    </body>
</html>
