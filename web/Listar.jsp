<%-- 
    Document   : Listar
    Created on : 08-mar-2017, 1:09:55
    Author     : User
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Controlador.Conexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="Css/Estilo.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Lista de películas</title>

        
    </head>
    <body>
     
    <%@include file="HeaderP.jspf" %>
        
  
  
    
        <div class="container">
  <h2>Películas registradas</h2>
  <h4>A continuación esta la lista de películas registradas:</h4> <br><br>          
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Nombre</th>
        <th>Género</th>
        <th>Estado</th>
        <th>Detallar</th>
        <th>Actualizar</th>
        <th>Eliminar</th>
        
      </tr>
    </thead>
    <% 
        
        
         HttpSession sesion = (HttpSession) request.getSession(true);
         
         String user = (String) sesion.getAttribute("Usuario");
         String contra = (String) sesion.getAttribute("Constraseña");
         
         if(user ==null && contra ==null){
         
             response.sendRedirect("index.jsp");
             
             
         }else{
         
         
         ResultSet rs = (ResultSet) request.getAttribute("lista");
  
         while(rs.next()){
    %>
    <tbody>
      <tr>
        <td><%= rs.getString("Nombre")%></td>
        <td><%= rs.getString("Genero")%></td>
        <td><%= rs.getString("Estado")%></td>
        <td ><span id="detallar"> </span></td>
        <td><span  id="actualizar"> </span></td>
        <td><span  id="eliminar"> </span></td>
      </tr>
    </tbody>
    
    <% 
         } //Cierre del while
    

          } //Cierre del else
      %>
  </table>
</div>

        
       
        
    </body>
</html>
