package com.cee.tech.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter print = res.getWriter();

        if (username.equals("Musili") && password.equals("Admin123"))
            print.write("Welcome to eticket system");
        else
            print.write("<html><body>Invalid credentials! <a href=\".\"> Login again </a></body></html>");

    }
}
