package com.example.servletjspdemo.web;

import com.example.servletjspdemo.service.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet("/addtocart")
public class Addtocart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws
            ServletException, IOException {

        httpServletResponse.setCharacterEncoding("UTF-8");
        HttpSession session = httpServletRequest.getSession();
        PrintWriter out = httpServletResponse.getWriter();
        ShoppingCartService shoppingCart;
        shoppingCart = (ShoppingCartService) session.getAttribute("cart");

        if (shoppingCart == null) {
            shoppingCart = new ShoppingCartService();
            session.setAttribute("cart", shoppingCart);
        }

          String model = httpServletRequest.getParameter("model");
          Double price = Double.parseDouble(httpServletRequest.getParameter("price"));
          shoppingCart.addToCart(model, price);
          httpServletResponse.sendRedirect("/smallshop/shoppingcart");
    }
}
