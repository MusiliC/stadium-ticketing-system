package com.cee.tech.auth;

import com.cee.tech.app.model.User;
import com.cee.tech.database.Database;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/login", initParams = {
        @WebInitParam(name = "username", value = "Musili"),
        @WebInitParam(name = "password", value = "Admin123")
})
public class Login extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        if (StringUtils.isNotBlank((String) httpSession.getAttribute("LoginId")))
            res.sendRedirect("/home");
        else
            res.sendRedirect("./");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {



        ServletContext context = getServletContext();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Database database = Database.getDbInstance();

        System.out.println("What time was this db created: " + database.getDatabaseCreatedAt());

        for (User user : database.getUsers()) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                HttpSession httpSession = req.getSession(true);
                httpSession.setAttribute("LoginId", new Date().getTime() + "");
                //implementing cookies
                Cookie newCookie = new Cookie("username", username);
                res.addCookie(newCookie);
                //sending data -> another servlet
                httpSession.setAttribute("username", username);
                res.sendRedirect("./home");
                // res.sendRedirect("./app/home.html");
            }
        }

        //getInitParams - accessing servlet config
        //getParams - getting client request data
        //context(initialized servletContext) - context.getInitParams - servlet context
        PrintWriter print = res.getWriter();

        print.write("<html><body>Invalid credentials! <a href=\".\"> Login again </a></body></html>");
    }


}
