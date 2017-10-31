package com.example.servletjspdemo.web;

import com.example.servletjspdemo.domain.Computer;
import com.example.servletjspdemo.service.ShoppingCartService;
import com.example.servletjspdemo.service.StorageService;

import javax.servlet.ServletContext;
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

    private int counter = 1;

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws
            ServletException, IOException {

        httpServletResponse.setCharacterEncoding("UTF-8");
        HttpSession session = httpServletRequest.getSession();

        ShoppingCartService shoppingCart;
        shoppingCart = (ShoppingCartService) session.getAttribute("cart");
        ServletContext appContext = httpServletRequest.getServletContext();
        StorageService shopDB = (StorageService) appContext.getAttribute("storage");
        if (shoppingCart == null) {
            shoppingCart = new ShoppingCartService();
            session.setAttribute("cart", shoppingCart);
        }
          int id = Integer.parseInt(httpServletRequest.getParameter("id"));

          Computer computer = shopDB.findComputerById(id);
          computer.decreaseAmount();
          shoppingCart.addToCart(counter, computer);
          ++counter;
          httpServletResponse.sendRedirect("/smallshop/showAllComputer.jsp");
    }
}
