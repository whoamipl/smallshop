package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getComputerData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Insert title here</title>\n");
      com.example.servletjspdemo.service.StorageService storage = null;
      synchronized (application) {
        storage = (com.example.servletjspdemo.service.StorageService) _jspx_page_context.getAttribute("storage", PageContext.APPLICATION_SCOPE);
        if (storage == null){
          storage = new com.example.servletjspdemo.service.StorageService();
          _jspx_page_context.setAttribute("storage", storage, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tbackground-color: #1c4150;\n");
      out.write("\tcolor: #e8ecee;\n");
      out.write("}\n");
      out.write("#topdiv{\n");
      out.write("\tmargin-left: auto;\n");
      out.write("\tmargin-right: auto;\n");
      out.write("\tposition: absolute;\n");
      out.write("}\n");
      out.write(".tabs {\n");
      out.write("\tmargin: 5px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\theight: 50px;\n");
      out.write("\twidth: 100px;\n");
      out.write("\tbackground-color: #32546c;\n");
      out.write("\tborder: 2px solid #8da0ad;\n");
      out.write("\tfloat: left;\n");
      out.write("\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("a {\n");
      out.write("\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #e8ecee;\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("\tcolor: #e8ecee;\n");
      out.write("}\n");
      out.write("form {\n");
      out.write("    position: relative;\n");
      out.write("    top:65px;\n");
      out.write("}\n");
      out.write("input {\n");
      out.write("  background-color:#32546c;\n");
      out.write("  border: 2px solid #8da0ad;\n");
      out.write("  margin: 2px;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"topdiv\">\n");
      out.write("\t<div class=\"tabs\"><a href='/smallshop/shoppingcard'>Shopping Card</div>\n");
      out.write("\t<div class=\"tabs\"><a href='/smallshop/getComputerData.jsp'>Add Computer</div>\n");
      out.write("\t<div class=\"tabs\"><a href='/smallshop/shop'>Shop</a></div>\n");
      out.write("\t<div/>\n");
      out.write("\t<form action=\"addComputer.jsp\">\n");
      out.write("      MODEL : <input type=\"text\" name=\"model\" required/>\n");
      out.write("      CPU   : <input type=\"text\" name=\"cpu\" required />\n");
      out.write("      GPU   : <input type=\"text\" name=\"gpu\" required/>\n");
      out.write("      RAM   : <input type=\"text\" name=\"ram\" required/>\n");
      out.write("      HDD   : <input type=\"text\" name=\"hdd\" required/>\n");
      out.write("      PRICE : <input type=\"text\" name=\"price\" required/>\n");
      out.write("      <input type=\"submit\" value=\" OK \">\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>");
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