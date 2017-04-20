<%-- 
    Document   : Eliminar
    Created on : 19-abr-2017, 18:19:57
    Author     : User
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Controlador.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Película</title>
    </head>
    <body>
        
        <%
            
            try {
            String id = (String) request.getParameter("Id");
            
           Conexion c = new Conexion();
           Connection co = c.Conectar();
           String n = "0";
           PreparedStatement st = co.prepareStatement("UPDATE peliculas SET Habilitar=? WHERE Id=?");
           st.setString(1, n);
           st.setString(2, id);
          
            st.executeUpdate();  %>
            
    <h4>Eliminó película correctamente</h4>
    
    <%     // response.sendRedirect("LstarPeliculas");
            co.close();
            st.close();
         
            }catch(Exception e){
            
                 System.out.println(e);
                // response.sendRedirect("ErrorP.jsp");
            
            }


        
        %>
        
     
        
        
    </body>
</html>
