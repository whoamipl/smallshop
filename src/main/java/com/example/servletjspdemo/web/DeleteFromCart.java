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

@WebServlet("/deletefromcart")
public class DeleteFromCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html");
        HttpSession session = httpServletRequest.getSession();
        ShoppingCartService shoppingCart = (ShoppingCartService) session.getAttribute("cart");
        shoppingCart.deleteFromCart(Integer.parseInt(httpServletRequest.getParameter("name")));
        httpServletResponse.sendRedirect("/smallshop/shoppingcart");
    }

}
