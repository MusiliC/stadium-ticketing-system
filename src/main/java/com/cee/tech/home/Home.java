package com.cee.tech.home;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cee.tech.app.bean.FixtureBean;
import com.cee.tech.app.bean.FixtureBeanI;


@WebServlet("/home")
public class Home extends HttpServlet {

    FixtureBeanI fixtureBean = new FixtureBean();
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        ServletContext context = getServletContext();
        PrintWriter print = res.getWriter();

        print.write(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <title>Welcome Page</title>\n" +
                        "    <style>\n" +
                        "        body {\n" +
                        "            background-color: white;\n" +
                        "            color: rgb(1, 69, 171);\n" +
                        "            text-align: center;\n" +
                        "            margin-top: 20px;\n" +
                        "        }\n" +
                        "        .welcome-message {\n" +
                        "            font-size: 2rem;\n" +
                        "        }\n" +
                        "        .fixture{\n" +
                        "            margin-top: 10px;\n" +
                        "            text-align: center;\n" +
                        "            font-size: 1rem;\n" +
                        "        }\n" +
                        "    </style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "Welcome: " + context.getAttribute("username") + "<br/> " +
                        context.getInitParameter("AppName") + "<br/> " +

                        "    <div class=\"welcome-message\">\n" +
                        "        Will implement stadium ticket booking system\n" +
                        "    </div>\n" +
                        "    <div class=\"fixture\">\n" +
                        "        <h2>Upcoming fixtures</h2>\n" );
                        print.write(fixtureBean.upcomingFixtures());
                        print.write(
                                "Server info: " + context.getServerInfo() + "<br/> " +
                                        "Application Deployment info: " + context.getRealPath(context.getContextPath()) + "<br/> "
                        );
                        print.write(
                        "    </div>\n" +
                        "</body>\n" +
                        "</html>\n");
    }


}
