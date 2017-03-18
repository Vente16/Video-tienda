<%-- 
    Document   : IndexP
    Created on : 07-mar-2017, 23:04:03
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
        <title>Inicio</title>
    </head>
    <body>
        <%
        
      HttpSession sesion = (HttpSession)request.getSession(true);

     String Usuario = (String) sesion.getAttribute("Usuario");

   //  String Contra = (String) sesion.getAttribute("Contraseña");

      if(sesion.getAttribute("Usuario")==null){

          response.sendRedirect("Error.jsp");


     } else{   
        
        
        
        %>
        <%@include file="HeaderP.jspf" %>
      
        <h1>Bienvenido(a): <%=Usuario%></h1>
        
        
        
        <% 

                     }        
        
        %>
        
        
        
    </body>
</html>
