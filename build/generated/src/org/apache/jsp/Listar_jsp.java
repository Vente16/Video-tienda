package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Controlador.Conexion;
import java.sql.ResultSet;
import Controlador.Login;

public final class Listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/HeaderP.jspf");
    _jspx_dependants.add("/Detalle.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/Estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/alertify.core.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/alertify.default.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"Js/Funciones.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Lista de películas</title>\n");
      out.write("\n");
      out.write("     \n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Vídeo tienda</a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"active\"><a href=\"IndexP.jsp\">Inicio</a></li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Películas <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"RegistrarP.jsp\">Registrar</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <form action=\"ListarPeliculas\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">Listar</button>     \n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <form action=\"CerrarSesion\">\n");
      out.write("\n");
      out.write("                <li><button class=\"btn btn-danger\" type=\"submit\"><span class=\"glyphicon glyphicon-log-in\"></span>Salir</button>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </form>  \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write(" \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <h2>Películas registradas</h2>\n");
      out.write("  <h4>A continuación se muestra la lista de películas registradas:</h4> <br><br>          \n");
      out.write("  <table class=\"table table-bordered\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("       \n");
      out.write("        <th>Nombre</th>\n");
      out.write("        <th>Género</th>\n");
      out.write("        <th>Estado</th>\n");
      out.write("        <th>Detallar</th>\n");
      out.write("        <th>Actualizar</th>\n");
      out.write("        <th>Eliminar</th>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    ");
 
        
        
         HttpSession sesion = (HttpSession) request.getSession(true);
         
         String user = (String) sesion.getAttribute("Usuario");
         String contra = (String) sesion.getAttribute("Constraseña");
         
         if(user ==null && contra ==null){
         
             response.sendRedirect("index.jsp");
             
             
         }else{
         
         
         ResultSet rs = (ResultSet) request.getAttribute("lista");
  
         while(rs.next()){
             
          String id = rs.getString("Id");
    
      out.write("\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("       \n");
      out.write("          \n");
      out.write("        <td id=\"Nombre\">");
      out.print( rs.getString("Nombre"));
      out.write("</td>\n");
      out.write("        <td  id=\"Genero\">");
      out.print( rs.getString("Genero"));
      out.write("</td>\n");
      out.write("        <td  id=\"Estado\">");
      out.print( rs.getString("Estado"));
      out.write("</td>\n");
      out.write("        <td><a   class=\" glyphicon glyphicon-search btn btn-primary\" data-toggle=\"modal\" data-target=\"#Detalle\" href=\"Detalle.jsp\" ></a></td>\n");
      out.write("        <td><a  href=\"Actualizar.jsp?id=");
      out.print(rs.getString("Id"));
      out.write("\" class=\"glyphicon glyphicon-edit btn btn-success\" id=\"Actualiza\"></a></td>\n");
      out.write("        <td><button class=\"glyphicon glyphicon-trash btn btn-danger\"  data-toggle=\"modal\" data-target=\"#Confirma\"> </button></td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("\n");
      out.write(" <!--     <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\"> -->\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("     <!-- <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Información detallada</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <p id=\"informacion\">Some text in the modal.</p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>  \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> -->\n");
      out.write("    \n");
      out.write("      <div class=\"modal fade\" id=\"Confirma\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">¿De verdad desea elminar esta película?</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <p id=\"informacion\"></p>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("         \n");
      out.write("            <form action=\"EliminarPeliculas?id=");
      out.print(rs.getString("Id"));
      out.write("\"> \n");
      out.write("               <button type=\"submit\" class=\"btn btn-success\">Aceptar</buttton>\n");
      out.write("            </form>\n");
      out.write("          <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
 
         } //Cierre del while
    

          } //Cierre del else
      
      out.write("\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("       <div id=\"#\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h4 class=\"modal-title\">Datos</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <p>Nombre:</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
