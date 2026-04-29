package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h1>Welcome to DevOps Demo App</h1>");
        response.getWriter().println("<h2>CI/CD using GitHub Actions</h2>");
        response.getWriter().println("<p>ACTE: AWS</p>");
    }
}
