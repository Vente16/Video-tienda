<%-- 
    Document   : Registrar.jsp
    Created on : 07-mar-2017, 16:17:51
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
        <title>Registro</title>
        <style>
            .form-horizontal{

                width: 300px;
                text-content: center;

            }     
        </style>
    </head>

    <body>

        <%@include file="header.jspf" %>

        <div class="container">
            <div class="jumbotron">

                <form class="form-horizontal" action="RegistrarUsuario" method="post">

                    <div class="form-group">
                        <label class="control-label col-sm-2">Usuario:</label>

                        <input type="text" class="form-control" name="Usuario">

                        <label class="control-label col-sm-2">Contraseña:</label>

                        <input type="password" class="form-control" name="Contra">

                        <label class="control-label col-sm-2">Rol:</label>
                        <select class="form-control" name="Rol">

                            <option>Admin</option>
                            <option>Cliente</option>
                            <option>Usuario</option>

                        </select><br>

                        <button type="submit"  class="btn btn-success">Registrar</button>
                    </div>
            </div>

        </form>
    </div>  
     
</body>
</html>
