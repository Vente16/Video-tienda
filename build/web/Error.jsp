 
<%-- 
    Document   : Error
    Created on : 07-mar-2017, 19:52:28
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
       <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Error</title>
    </head>
    <body>
        
        <%@include file="header.jspf"%>
        
        
        <div class="container">
            <div class="jumbotron">
                <div class="alert alert-danger">
                    <h1>   <strong>Error!</strong> </h1> <p>Usuario o contraseña inválido.</p>
                </div>   
            </div>
        </div>     
        
        
        
    </body>
</html>
