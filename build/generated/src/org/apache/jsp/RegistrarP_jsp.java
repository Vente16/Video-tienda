package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("       <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("       <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Registrar película</title>\n");
      out.write("           <style>\n");
      out.write("            \n");
      out.write("            .form-horizontal{\n");
      out.write("                \n");
      out.write("                width: 300px;\n");
      out.write("                text-content: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Vídeo tienda</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"IndexP.jsp\">Home</a></li>\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Películas <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"RegistrarP.jsp\">Registrar</a></li>\n");
      out.write("          <li><a href=\"Listar.jsp\">Listar</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <form action=\"CerrarSesion\">\n");
      out.write("       \n");
      out.write("            <li><a href=\"#\"><button class=\"btn btn-danger\" data-toggle=\"modal\" type=\"submit\"><span class=\"glyphicon glyphicon-log-in\"></span>Salir</button></a></li>\n");
      out.write("        </form>  \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("                    \n");
      out.write("             ");

        
      HttpSession sesion = (HttpSession)request.getSession();
 

      
      String Usuario = (String) sesion.getAttribute("Usuario");

      String Contra = (String) sesion.getAttribute("Contraseña");

      if(Usuario ==null && Contra==null){

          response.sendRedirect("Error.jsp");


     } else{   
        
        
        
        
      out.write("            \n");
      out.write("                    \n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("\n");
      out.write("                <form class=\"form-horizontal\" action=\"RegistrarPelicula\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\">Nombre:</label>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"Nombre\">\n");
      out.write("\n");
      out.write("                    <label class=\"control-label col-sm-2\">Género:</label>\n");
      out.write("                    \n");
      out.write("                       <select class=\"form-control\" name=\"Genero\">\n");
      out.write("\n");
      out.write("                        <option>Comedia</option>\n");
      out.write("                        <option>Romance</option>\n");
      out.write("                        <option>Acción</option>\n");
      out.write("                        <option>Terror</option>\n");
      out.write("                    </select><br>\n");
      out.write("                   \n");
      out.write("                     <label class=\"control-label col-sm-2\">Duración:</label>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"Duracion\">\n");
      out.write("                    \n");
      out.write("                     <label class=\"control-label col-sm-2\">Clasificación:</label>\n");
      out.write("\n");
      out.write("                     <select class=\"form-control\" name=\"Clasificacion\">\n");
      out.write("\n");
      out.write("                        <option>Mala</option>\n");
      out.write("                        <option>Regular</option>\n");
      out.write("                        <option>Buena</option>\n");
      out.write("                        <option>Excelente</option>\n");
      out.write("                    </select><br>\n");
      out.write("                   \n");
      out.write("                     <label class=\"control-label col-sm-2\">Disponibilidad:</label>\n");
      out.write("                    <select class=\"form-control\" name=\"Disponibilidad\">\n");
      out.write("\n");
      out.write("                        <option>Disponible</option>\n");
      out.write("                        <option>No disponible</option>\n");
      out.write("                    </select><br>\n");
      out.write("                   \n");
      out.write("                      <label class=\"control-label col-sm-2\">Estado:</label>\n");
      out.write("                    <select class=\"form-control\" name=\"Estado\">\n");
      out.write("\n");
      out.write("                        <option>Activa</option>\n");
      out.write("                        <option>Inactiva</option>\n");
      out.write("                    </select><br>\n");
      out.write("                    \n");
      out.write("                     <label class=\"control-label col-sm-2\">Ejemplares:</label>\n");
      out.write("\n");
      out.write("                     <input type=\"text\" class=\"form-control\" name=\"Ejemplares\"><br>\n");
      out.write("                    \n");
      out.write("                     <label class=\"control-label col-sm-2\">Empleado:</label>\n");
      out.write("\n");
      out.write("                     <input type=\"text\" class=\"form-control\" name=\"Empleado\"><br>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    <button type=\"submit\"  class=\"btn btn-success\">Registrar</button>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
   

              }
        
        
      out.write("\n");
      out.write("        \n");
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
