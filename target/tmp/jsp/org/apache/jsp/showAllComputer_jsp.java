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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div>\n");
      out.write("\t\t<div class=\"tabs\" style=\"display: inline-block; border: solid 1px #000; text-decoration: none;\"><a href='/smallshop/shoppingcart'>Shopping Card</a></div>\n");
      out.write("\t\t<div class=\"tabs\" style=\"display: inline-block; border: solid 1px #000; text-decoration: none;\"><a href='/smallshop/getComputerData.jsp'>Add Computer</a></div>\n");
      out.write("\t<div class=\"tabs\" style=\"display: inline-block; border: solid 1px #000; text-decoration: none;\"><a href='/smallshop/showAllComputers.jsp'>Shop</a></div>\n");
      out.write("\t<div/>\n");
      out.write("\t  ");

	      java.util.Map<Integer, com.example.servletjspdemo.domain.Computer> computers = storage.getShopDb();
          for (java.util.Map.Entry<Integer, com.example.servletjspdemo.domain.Computer> entry : computers.entrySet()) {
			  out.println("<form action=\"addtocart\">\n" +
			  " \t<p>Model:&nbsp;"+entry.getValue().getModel()+"&nbsp;Cena:&nbsp;"+entry.getValue().getPrice()+"Ilość w magazynie:&nbsp;"+entry.getValue().getAmout()+
			  "  <input type=\"hidden\" name=\"id\" value=\""+entry.getKey()+"\"/>" +
			  "  <input type=\"hidden\" name=\"price\" value=\""+entry.getValue().getPrice()+"\"/>" +
			  "  <input type=\"submit\" value=\"Dodaj do koszyka\">\"\n" +
			  "</form>");
			  }
           out.println("<hr>");

      
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
