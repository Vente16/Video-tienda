<%-- 
    Document   : Actualizar
    Created on : 24-mar-2017, 14:22:29
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="Css/Estilo.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
      
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <script  src="Js/Funciones.js"></script>
          <style>
            
            .form-horizontal{
                
                width: 300px;
                text-content: center;
                
            }
            
            
        </style>
    </head>
    <body>
        
     <%  

         HttpSession sesion = (HttpSession) request.getSession(true);
         
         String user = (String) sesion.getAttribute("Usuario");
         String contra = (String) sesion.getAttribute("Constraseña");
         
         if(user ==null && contra ==null){
         
             response.sendRedirect("index.jsp"); 

         } else {
     
     
        %>
             
              
        <%@include file="HeaderP.jspf" %>
                                            
           <div class="container">

               
               <%  
                   
                   
               String Id = (String) request.getParameter("id");
               
              Conexion c = new Conexion();
               Connection co = c.Conectar();
           
             PreparedStatement st = co.prepareStatement("SELECT *FROM peliculas WHERE Id="+Id);
            
             ResultSet rs = st.executeQuery();
           
                 while(rs.next()){  
                     
               %>
               
               
               
               
               
           
            <div class="jumbotron">

                <form class="form-horizontal" action="ActualizarPeliculas" method="post">
                    
     
               
                <div class="form-group">
                    <input type="text" name="Id" value="<%=Id%>" class="hidden">
                    
                    
                    <label class="control-label col-sm-2">Nombre:</label>
                        
                    <input type="text" class="form-control" name="Nombre" value="<%=rs.getString("Nombre")%>">

                    <label class="control-label col-sm-2">Género:</label>
                    
                       <select class="form-control" name="Genero">

                        <option><%=rs.getString("Genero")%></option>
                        <option>Romance</option>
                        <option>Acción</option>
                        <option>Terror</option>
                    </select><br>
                   
                     <label class="control-label col-sm-2">Duración:</label>

                     <input type="text" class="form-control" name="Duracion" value="<%=rs.getString("Duracion")%>">
                    
                     <label class="control-label col-sm-2">Calificación:</label>

                     <select class="form-control" name="Clasificacion">

                        <option><%=rs.getString("Clasificacion")%></option>
                        <option>Regular</option>
                        <option>Buena</option>
                        <option>Excelente</option>
                    </select><br>
                   
                     <label class="control-label col-sm-2">Disponibilidad:</label>
                    <select class="form-control" name="Disponibilidad">

                        <option><%=rs.getString("Disponibilidad")%></option>
                        <option>No disponible</option>
                    </select><br>
                   
                      <label class="control-label col-sm-2">Estado:</label>
                    <select class="form-control" name="Estado" >

                        <option><%=rs.getString("Estado")%></option>
                        <option>Inactiva</option>
                    </select><br>
                    
                     <label class="control-label col-sm-2">Ejemplares:</label>

                     <input type="text" class="form-control" name="Ejemplares" value="<%=rs.getString("Ejemplares")%>"><br>
                    
                     <label class="control-label col-sm-2">Empleado:</label>

                     <input type="text" class="form-control" name="Empleado" value="<%=rs.getString("Empleado_Registro")%>"><br>
                    
                     
                    <button type="submit"  class="btn btn-success">Acutalizar</button>
                </div>
                </div>
                    
        </form>
        </div>
                      
                    
        
        <%
                  } // Cierro el while
     
                } // Cierro el else
       %>
     
      
    </body>
</html>
