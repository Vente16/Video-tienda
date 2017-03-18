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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class RegistrarPelicula extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          
            try{
                
                String nombre = request.getParameter("Nombre");
                String genero = request.getParameter("Genero");
                String duracion = request.getParameter("Duracion");
                String clasificacion = request.getParameter("Clasificacion");
                String disponibilidad = request.getParameter("Disponibilidad");
                String estado = request.getParameter("Estado");
                String ejemplares = request.getParameter("Ejemplares");
                String empleado = request.getParameter("Empleado");
            
             Conexion c = new Conexion();
             Connection co = c.Conectar();
             
             PreparedStatement st = co.prepareStatement("INSERT INTO peliculas (Nombre,Genero,Duracion,Clasificacion,Disponibilidad,Estado,Ejemplares,Empleado_Registro) VALUES (?,?,?,?,?,?,?,?)");
             st.setString(1, nombre);
             st.setString(2, genero);
             st.setString(3, duracion);
             st.setString(4, clasificacion);  
             st.setString(5, disponibilidad);
             st.setString(6, estado);
             st.setString(7, ejemplares);
             st.setString(8, empleado);
             st.executeUpdate();
             
             RequestDispatcher rd = request.getRequestDispatcher("CorrectoP.jsp");
             rd.forward(request, response);
             
             st.close();
             co.close();
             
             
            
            }catch(Exception e){
            
                System.out.println(""+e);
   
            }
            
            
            
            
            
            
            
            
            
            
            
            
        } finally {
            out.close();
        }
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
        processRequest(request, response);
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
