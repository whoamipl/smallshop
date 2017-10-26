package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.servletjspdemo.domain.Computer;

public final class showAllComputer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      com.example.servletjspdemo.service.StorageService storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Computer computer = null;
      synchronized (application) {
        computer = (com.example.servletjspdemo.domain.Computer) _jspx_page_context.getAttribute("computer", PageContext.APPLICATION_SCOPE);
        if (computer == null){
          computer = new com.example.servletjspdemo.domain.Computer();
          _jspx_page_context.setAttribute("computer", computer, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                background-color: #1c4150;\n");
      out.write("                color: #e8ecee;\n");
      out.write("            }\n");
      out.write("            #topdiv{\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("            .tabs {\n");
      out.write("                margin: 5px;\n");
      out.write("                display: inline-block;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 100px;\n");
      out.write("                background-color: #32546c;\n");
      out.write("                border: 2px solid #8da0ad;\n");
      out.write("                float: left;\n");
      out.write("                text-align: center;\n");
      out.write("                }\n");
      out.write("            a {\n");
      out.write("\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #e8ecee;\n");
      out.write("            }\n");
      out.write("            a:visited {\n");
      out.write("                color: #e8ecee;\n");
      out.write("            }\n");
      out.write("            form {\n");
      out.write("                position: relative;\n");
      out.write("                top:65px;\n");
      out.write("            }\n");
      out.write("            input {\n");
      out.write("              background-color:#32546c;\n");
      out.write("              border: 2px solid #8da0ad;\n");
      out.write("              margin: 2px;\n");
      out.write("              display: block;\n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"topdiv\">\n");
      out.write("\t<div class=\"tabs\"><a href='/smallshop/shoppingcard'>Shopping Card</div>\n");
      out.write("\t<div class=\"tabs\"><a href='/smallshop/getComputerData.jsp'>Add Computer</div>\n");
      out.write("\t<div class=\"tabs\"><a href='/smallshop/shop'>Shop</a></div>\n");
      out.write("\t<div/>\n");
      out.write("\t  ");

	      java.util.Map<Integer, com.example.servletjspdemo.domain.Computer> computers = storage.getShopDb();
          for (java.util.Map.Entry<Integer, com.example.servletjspdemo.domain.Computer> entry : computers.entrySet()) {
                            out.println("<form action=\"addtocart\" >\n" +
                                    "<th>Model</th> <th>Price</th> <th>Dodaj do koszyka</th>\n" +
                                    "<tr><td>"+entry.getValue().getModel()+"</td><td>"+entry.getValue().getPrice()+"</td>\n" +
                                    "<td><input type=\"hidden\" name=\"model\" value=\""+entry.getValue().getModel()
                                    +"\">\n" +
                                    "<input type=\"hidden\" name=\"price\" value=\""+entry.getValue().getPrice()+"\">\n"

                                    +
                                    "<input type=\"submit\" value=\"Dodaj do koszyka\"></td></tr>\n" +
                                    "</form>");
                        }
      
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
