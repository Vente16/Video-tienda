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
public class Login extends HttpServlet {

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
            
            String user = request.getParameter("Usuario");
            String contraseña = request.getParameter("Contra");
           
            
            Conexion c = new Conexion();
            Connection co = c.Conectar();
            
            PreparedStatement st = co.prepareStatement("SELECT *FROM usuarios WHERE Usuario=? AND Contraseña=?");
            st.setString(1, user);
            st.setString(2, contraseña);
            ResultSet rs = st.executeQuery();
            
           
            
            
            
                if(rs.absolute(1)){
                
             //    String rol = rs.getString("Rol");
                 
                 HttpSession Sesion = request.getSession();
                 Sesion.setAttribute("Usuario", user);
                 Sesion.setAttribute("Constraseña", contraseña);
                 request.setAttribute("rol", rs.getString("Rol"));
                 
                 response.sendRedirect("IndexP.jsp");
                }else{
                
                  
                 response.sendRedirect("Error.jsp");
                
                }
                
            
          
            
            
            
            
            
            
            
            
            
            
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