package com.example.servletjspdemo.web;

import com.example.servletjspdemo.service.ShoppingCartService;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet("/shoppingcart")
public class ShoppinCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html");
        HttpSession session = httpServletRequest.getSession();
        ShoppingCartService shoppingCart = (ShoppingCartService) session.getAttribute("cart");

        PrintWriter out = httpServletResponse.getWriter();

        HashMap<String, Integer> items = shoppingCart.getCartItems();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Produkt został dodany do twojego koszyka</h1>");
        out.println("<hr>");
        out.println("<h2>Cart</h2>");
        out.println("<table border='1px'>");
        for(String key: items.keySet())
            out.println("<tr><td>"+key+" - </td><td>"+"$"+items.get(key)+"</td></tr>");
        out.println("<table>");
        out.println("</body>");
        out.println("</html>");
    }
}
