package com.example.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogInServlet", urlPatterns = "/login/*")
public class LogInServlet extends HttpServlet {

    private String email;
    private String password;

    public void init() {
        this.email = "test@example.com";
        this.password = "password";
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        System.out.println("POST RECEIVED");

        String email = request.getParameter("email");
        String password = request.getParameter("password");


        if (email != null && password != null) {
            if (email.contentEquals(this.email) && password.contentEquals(this.password)) {
                getServletContext().getRequestDispatcher("/LoginSuccessful.html").forward(request, response);
            } else {
                getServletContext().getRequestDispatcher("/LoginFailed.html").forward(request, response);
            }
        }
    }
}
