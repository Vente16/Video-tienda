package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OlvidoContraseña_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jspf");
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
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("       \t<script src=\"https://code.jquery.com/jquery-3.2.0.min.js\"></script>\t\n");
      out.write("        <title>Olvidé mi contraseña</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Vídeo tienda</a>\n");
      out.write("    </div>\n");
      out.write("   <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#\"></a></li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"Registrar.jsp\"><button class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-user\"></span> Regístrate</button></a></li>\n");
      out.write("      <li><a href=\"#\"><button class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#Login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</button></a></li>\n");
      out.write("    </ul> \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("  <div class=\"modal fade\" id=\"Login\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\" style=\"text-align: center\">Login</h4>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("              <div class=\"container\">\n");
      out.write("                  <form action=\"Login\" method=\"post\">\n");
      out.write("\n");
      out.write("                      <label>Usuario</label><br>\n");
      out.write("                      <input type=\"text\" name=\"Usuario\"><br>\n");
      out.write("                      <label>Contraseña</label><br>\n");
      out.write("                      <input type=\"password\" name=\"Contra\"><br><br>\n");
      out.write("                      <input type=\"submit\" value=\"Acceder\" class=\"btn btn-success\">\n");
      out.write("                      \n");
      out.write("                  </form>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("         \n");
      out.write("    <h1>Has olvidado tu contraseña</h1>\n");
      out.write("       \n");
      out.write("    <h4>Por favor ingresa aquí tu correo eletrónico para enviarte tu contraseña</h4> \n");
      out.write("     \n");
      out.write("    <form action=\"action\">\n");
      out.write("        \n");
      out.write("        <input type=\"text\" name=\"correo\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-info\">Validar</button>\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("      \n");
      out.write("    \n");
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
