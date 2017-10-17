package com.example.servletjspdemo.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count2")
public class CounterServlet2 extends HttpServlet {

    @Override
    public void init() {

        getServletContext().setAttribute("appCounter", new Counter());
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {

        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();

        out.println(session.getId());
        out.println(session.getLastAccessedTime());
        out.println(session.getMaxInactiveInterval());
        out.println(session.getCreationTime());


        if (session.getAttribute("counterSes") == null) {
            session.setAttribute("counterSes", new Counter());
        }

        Counter counter = (Counter) session.getAttribute("counterSes");
        counter.incr();
        out.println(counter.getCounter());

        Counter appCounter = (Counter) getServletContext().getAttribute("appCounter");
        appCounter.incr();
        out.println(appCounter.getCounter());
        init();
    }
}
