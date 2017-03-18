<%-- 
    Document   : RegistrarP
    Created on : 07-mar-2017, 23:35:40
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
        <title>Registrar película</title>
           <style>
            
            .form-horizontal{
                
                width: 300px;
                text-content: center;
                
            }
            
            
        </style>
    </head>
    <body>
         <%@include file="HeaderP.jspf" %> 
                    
             <%
        
      HttpSession sesion = (HttpSession)request.getSession();
 

      
      String Usuario = (String) sesion.getAttribute("Usuario");

      String Contra = (String) sesion.getAttribute("Contraseña");

      if(Usuario ==null && Contra==null){

          response.sendRedirect("index.jsp");


     } else{   
        
        
        
        %>            
                    
       
        <div class="container">

           
            <div class="jumbotron">

                <form class="form-horizontal" action="RegistrarPelicula">

                <div class="form-group">
                    <label class="control-label col-sm-2">Nombre:</label>

                    <input type="text" class="form-control" name="Nombre">

                    <label class="control-label col-sm-2">Género:</label>
                    
                       <select class="form-control" name="Genero">

                        <option>Comedia</option>
                        <option>Romance</option>
                        <option>Acción</option>
                        <option>Terror</option>
                    </select><br>
                   
                     <label class="control-label col-sm-2">Duración:</label>

                    <input type="text" class="form-control" name="Duracion">
                    
                     <label class="control-label col-sm-2">Clasificación:</label>

                     <select class="form-control" name="Clasificacion">

                        <option>Mala</option>
                        <option>Regular</option>
                        <option>Buena</option>
                        <option>Excelente</option>
                    </select><br>
                   
                     <label class="control-label col-sm-2">Disponibilidad:</label>
                    <select class="form-control" name="Disponibilidad">

                        <option>Disponible</option>
                        <option>No disponible</option>
                    </select><br>
                   
                      <label class="control-label col-sm-2">Estado:</label>
                    <select class="form-control" name="Estado">

                        <option>Activa</option>
                        <option>Inactiva</option>
                    </select><br>
                    
                     <label class="control-label col-sm-2">Ejemplares:</label>

                     <input type="text" class="form-control" name="Ejemplares"><br>
                    
                     <label class="control-label col-sm-2">Empleado:</label>

                     <input type="text" class="form-control" name="Empleado"><br>
                    
                     
                    <button type="submit"  class="btn btn-success">Registrar</button>
                </div>
                </div>

            </form>
        </div>
        
        <%   

              }
        
        %>
        
        
        
        
    </body>
</html>
