<%-- 
    Document   : OlvidoContraseña
    Created on : 19-abr-2017, 12:07:00
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       	<script src="https://code.jquery.com/jquery-3.2.0.min.js"></script>	
        <title>Olvidé mi contraseña</title>
       
    </head>
    <body>
     
    <%@include file="header.jspf"%>
         
    <div class="container">
        <h1>Has olvidado tu contraseña</h1>

        <h4>Por favor ingresa aquí tu correo eletrónico para enviarte tu contraseña</h4> 

        <form action="OlvidoContrasena">
            <input type="text" name="correo">
            <button type="submit" class="btn btn-info">Validar</button>

        </form>
      
    </div>
    
        
        
    </body>
</html>
