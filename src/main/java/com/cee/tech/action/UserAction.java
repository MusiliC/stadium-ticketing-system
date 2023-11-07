package com.cee.tech.action;

import com.cee.tech.app.model.User;
import com.cee.tech.database.Database;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/user")
public class UserAction extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        Database database = Database.getDbInstance();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (password.equals(confirmPassword))
            database.getUsers().add(new User(100L, username, password));
        res.sendRedirect("./");

    }
}
