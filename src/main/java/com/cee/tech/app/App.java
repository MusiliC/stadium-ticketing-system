package com.cee.tech.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class App extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String homeInfo = (String) req.getAttribute("homeInfo");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter print = res.getWriter();

        print.write("<html><body> This App servlet " + homeInfo +  " username is : " + username + " and password is: " + password + " + </body></html>");

    }
}
