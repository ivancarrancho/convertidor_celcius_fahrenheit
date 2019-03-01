package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-family: monospace; font-size: 16px\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"text-align: center\">\n");
      out.write("        <h1 style=\"color:blue;\">-- Convertir a radianes --</h1>\n");
      out.write("        <small>Por favor ingrese los valores a convertir</small>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"add.jsp\" method=\"get\">\n");
      out.write("           <span style=\"font-size: 20px\">Ingrese grados°: </span> <input type=\"text\" name=\"val1\"><br>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\" value=\"convertir\" style=\"background-color: black; color: white; width: 100px; height: 30px; font-size: 16px; border-radius: 10px;\">\n");
      out.write("        </form>   \n");
      out.write("\n");
      out.write("        ");

            double f = 0;
            
            ArrayList gradesArray = new ArrayList();
            ArrayList radianesArray = new ArrayList();
            
            Integer cuadrante = 0;
            Integer new_i = 0;
            if (request.getParameter("val1") != "") {

                try {
                    new_i = Integer.parseInt(request.getParameter("val1"));
                    if (new_i > 0 && new_i <= 90){
                        cuadrante = 1;
                        for (int x = new_i; x <= 90; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }
                    } 
                    else if (new_i > 90 && new_i <= 180) {
                        cuadrante = 2;
                        for (int x = new_i; x <= 180; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }                        
                    }
                    else if (new_i > 180 && new_i <= 270) {
                        cuadrante = 3;
                        for (int x = new_i; x <= 270; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }                                                
                    }                    
                    else if (new_i > 270 && new_i <= 360) {
                        cuadrante = 4;
                        for (int x = new_i; x <= 360; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }                                                
                    }                  
                    
                } catch (NumberFormatException e) {
                    out.println("El número de grados no es válido<br><br>");
                }                
                
            }
            
        if (new_i > 0 && new_i <= 360) {
            out.println("<br> <b>Cuadrante</b>: " + cuadrante + "<br><br>");
            
            for (int g = 0; g < gradesArray.size(); g++) {
                out.println(
                    "<b>Grados</b>: " + (int) gradesArray.get(g) + " - "+ 
                    "<b>Radianes</b>: " + (double) radianesArray.get(g) + "<br>"  
                );
            }            
        } else {        
            out.println("<br>Por favor ingresa datos válidos<br><br>");
        }
        
      out.write("\n");
      out.write("    </body>    \n");
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
