package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Controlador.Conexion;
import java.sql.ResultSet;
import Controlador.Login;

public final class IndexP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/HeaderP.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("       <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("       <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        
      HttpSession sesion = (HttpSession)request.getSession(true);

     String Usuario = (String) sesion.getAttribute("Usuario");

   //  String Contra = (String) sesion.getAttribute("Contraseña");

      if(sesion.getAttribute("Usuario")==null){

          response.sendRedirect("Error.jsp");


     } else{   
        
        
        
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Vídeo tienda</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("            \n");
      out.write("       ");
 
           Conexion c = new Conexion();
           
           Connection co = c.Conectar();
           
          PreparedStatement st = co.prepareStatement("SELECT *FROM  peliculas");
          ResultSet rs = st.executeQuery();
          

          String rol = rs.getString("Rol");
  
             if(rol.equals("Cliente")){
        
      out.write("\n");
      out.write("       \n");
      out.write("      \n");
      out.write("        \n");
      out.write("         <li class=\"active\"><a href=\"IndexP.jsp\">Home</a></li>\n");
      out.write("       \n");
      out.write("         ");
   
            }else if(rol.equals("Admin")){

      out.write("\n");
      out.write("     \n");
      out.write("      \n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Películas <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"RegistrarP.jsp\">Registrar</a></li>\n");
      out.write("          <li>\n");
      out.write("              <form action=\"Prueba\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success\">Listar</button>     \n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("      </li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <form action=\"CerrarSesion\">\n");
      out.write("       \n");
      out.write("            <li><button class=\"btn btn-danger\" type=\"submit\"><span class=\"glyphicon glyphicon-log-in\"></span>Salir</button>\n");
      out.write("           </li>\n");
      out.write("            \n");
      out.write("        </form>  \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("       \n");
      out.write("      ");
    
      
                }    
       
      
      out.write("\n");
      out.write("      \n");
      out.write("        <h1>Bienvenido(a): ");
      out.print(Usuario);
      out.write("</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 

                     }        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
