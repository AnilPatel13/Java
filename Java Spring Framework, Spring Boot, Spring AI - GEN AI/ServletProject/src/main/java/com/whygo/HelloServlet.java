package com.whygo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("In Service");
        try {
            response.setContentType("text/html");
            response.getWriter().println("<h1>Hello, World!</h1>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
