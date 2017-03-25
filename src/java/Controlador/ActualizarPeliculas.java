/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class ActualizarPeliculas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           processRequest(request, response);
        
         try {
            
               Conexion c = new Conexion();
              Connection co = c.Conectar();
           
                String id = request.getParameter("Id");
                String nombre = request.getParameter("Nombre");
                String genero = request.getParameter("Genero");
                String duracion = request.getParameter("Duracion");
                String clasificacion = request.getParameter("Clasificacion");
                String disponibilidad = request.getParameter("Disponibilidad");
                String estado = request.getParameter("Estado");
                String ejemplares = request.getParameter("Ejemplares");
                String empleado = request.getParameter("Empleado");
  
             PreparedStatement ps = co.prepareStatement("UPDATE peliculas SET Nombre=?,Genero=?,Duracion=?,Clasificacion=?,Disponibilidad=?,Estado=?,Ejemplares=?,Empleado_Registro=? WHERE Id=?");
                
             ps.setString(1, nombre);
             ps.setString(2, genero);
             ps.setString(3, duracion);
             ps.setString(4, clasificacion);  
             ps.setString(5, disponibilidad);
             ps.setString(6, estado);
             ps.setString(7, ejemplares);
             ps.setString(8, empleado);
             ps.setString(9, id);
             ps.executeUpdate();
             
             response.sendRedirect("CorrectoP.jsp");
             
             ps.close();
             co.close();
             
             
        } catch (Exception e) {
        
             response.sendRedirect("Error.jsp");
              System.out.println(e);
            
        }
     
        
        
         
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
