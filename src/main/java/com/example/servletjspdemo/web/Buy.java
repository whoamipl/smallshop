package com.example.servletjspdemo.web;
import com.example.servletjspdemo.domain.Computer;
import com.example.servletjspdemo.service.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/buy")
public class Buy extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        HttpSession session = httpServletRequest.getSession();
        ShoppingCartService cart = (ShoppingCartService) session.getAttribute("cart");
        cart.deleteAll();
        PrintWriter out = httpServletResponse.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Koszyk</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>\n" +
                "\t\t<div class=\"tabs\" style=\"display: inline-block; border: solid 1px #000; text-decoration: none;\"><a href='/smallshop/shoppingcart'>Shopping Card</a></div>\n" +
                "\t\t<div class=\"tabs\" style=\"display: inline-block; border: solid 1px #000; text-decoration: none;\"><a href='/smallshop/getComputerData.jsp'>Add Computer</a></div>\n" +
                "\t<div class=\"tabs\" style=\"display: inline-block; border: solid 1px #000; text-decoration: none;\"><a href='/smallshop/showAllComputer.jsp'>Shop</a></div>\n" +
                "\t<div/>");
        out.println("<h1>Przyjęto zamowienie do realizacji!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
