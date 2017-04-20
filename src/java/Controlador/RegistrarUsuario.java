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
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class RegistrarUsuario extends HttpServlet {

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
        
          try{
                 
            String user = request.getParameter("Usuario");
            String contraseña = request.getParameter("Contra");
            String rol = request.getParameter("Rol");
            
       
            Conexion c = new Conexion();
            Connection co = c.Conectar();
            
            PreparedStatement ps = co.prepareStatement("SELECT *FROM Usuarios WHERE Usuario=?");
            ps.setString(1, user);
            ResultSet ra = ps.executeQuery();
            
               if(ra.absolute(1)){
               
                 response.sendRedirect("Existe.jsp");
               } 
             
               else {
           
            
               PreparedStatement st = co.prepareStatement("INSERT INTO usuarios (Usuario,Contraseña,Rol) VALUES(?,?,?)");
                st.setString(1, user);
                st.setString(2, contraseña);
                st.setString(3, rol);
           
                st.executeUpdate();
             
                st.close();
                co.close();
             
            RequestDispatcher rs = request.getRequestDispatcher("Correcto.jsp");
            rs.forward(request, response);
       
           
            
               }
            
             }catch(Exception e){
               
                 System.out.println(""+e);
             
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
