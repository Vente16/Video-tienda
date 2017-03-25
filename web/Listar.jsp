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
        <link rel="stylesheet" href="Css/alertify.core.css">
        <link rel="stylesheet" href="Css/alertify.default.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="Js/Funciones.js"></script>
        
        <title>Lista de películas</title>

     
   
        
        
    </head>
    <body>
     
    <%@include file="HeaderP.jspf" %>
        
  
  
    
        <div class="container">
  <h2>Películas registradas</h2>
  <h4>A continuación se muestra la lista de películas registradas:</h4> <br><br>          
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
             
          String id = rs.getString("Id");
    %>
    <tbody>
      <tr>
       
          <td id="Nombre"><%= rs.getString("Nombre")%></td>
        <td  id="Genero"><%= rs.getString("Genero")%></td>
        <td  id="Estado"><%= rs.getString("Estado")%></td>
        <td><button  id="modal" type="button" class=" glyphicon glyphicon-search btn btn-primary" data-toggle="modal" data-target="#myModal" ></button></td>
        <td><a href="Actualizar.jsp?id=<%=rs.getString("Id")%>" class="glyphicon glyphicon-edit btn btn-success"></a></td>
        <td><button class="glyphicon glyphicon-trash btn btn-danger"  data-toggle="modal" data-target="#Confirma"> </button></td>
      </tr>
    </tbody>

      <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Información detallada</h4>
        </div>
        <div class="modal-body">
          <p id="informacion">Some text in the modal.</p>
          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
    
      <div class="modal fade" id="Confirma" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">¿De verdad desea elminar esta película?</h4>
        </div>
        <div class="modal-body">
          <p id="informacion"></p>
        </div>
          <form action="EliminarPelicula">
        <div class="modal-footer">
         
          <button type="submit" class="btn btn-success">Aceptar</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
        </div>
      </form>
      </div>
      
    </div>
  </div>
    
    
    <% 
         } //Cierre del while
    

          } //Cierre del else
      %>
  </table>
</div>
       

        
    </body>
</html>
