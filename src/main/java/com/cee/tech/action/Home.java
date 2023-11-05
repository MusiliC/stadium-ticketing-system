package com.cee.tech.action;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.cee.tech.app.bean.FixtureBean;
import com.cee.tech.app.bean.FixtureBeanI;
import org.apache.commons.lang3.StringUtils;


@WebServlet("/home")
public class Home extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        if (StringUtils.isNotBlank((String) httpSession.getAttribute("LoginId"))) {
            ServletContext context = getServletContext();
            FixtureBeanI fixtureBean = new FixtureBean();
            PrintWriter print = res.getWriter();

            String accessCookie = null;
            //accessing the cookie
            Cookie[] cookies = req.getCookies();

            for (Cookie myCookie: cookies){
                if (myCookie.getName().equals("username")){
                    accessCookie = myCookie.getValue();
                }

            }
            System.out.println("********** " + accessCookie + "***************");


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
                            "  ul.navbar {\n" +
                            "      background-color: white;\n" +
                            "      list-style-type: none;\n" +
                            "      margin: 0;\n" +
                            "      padding: 0;\n" +
                            "      display: flex;\n" +
                            "      justify-content: space-between;\n" +
                            "      align-items: center;\n" +
                            "    }\n" +
                            "\n" +
                            "    /* Style the list items (links) in the navbar */\n" +
                            "    ul.navbar li {\n" +
                            "      margin-right: 20px;\n" +
                            "    }\n" +
                            "\n" +
                            "    /* Style the Eticket title */\n" +
                            "    ul.navbar .title {\n" +
                            "      color: blue;\n" +
                            "    }\n" +
                            "\n" +
                            "    /* Style the outline button */\n" +
                            "    ul.navbar .btn {\n" +
                            "      border: 2px solid blue;\n" +
                            "      padding: 5px 15px;\n" +
                            "      color: blue;\n" +
                            "      text-decoration: none;\n" +
                            "      border-radius: 5px;\n" +
                            "    }" +
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
                            " <nav>\n" +
                            "    <ul class=\"navbar\">\n" +
                            "      <li class=\"title\">Eticket</li>\n" +
                            "      <li><a href=\"./home\">Home</a></li>\n" +
                            "      <li><a href=\"./tickets\">Ticket</a></li>\n" +
                            "      <li><a href=\"./fixtures\">Fixtures</a></li>\n" +
                            "      <li class=\"btn\"><a href=\"#\">Contact</a></li>\n" +
                            "    </ul>\n" +
                            "  </nav>" +
                            "Welcome: " + httpSession.getAttribute("username") + "<br/> " +
                            context.getInitParameter("AppName") + "<br/> " +
                            " <a href=\"./tickets\"> Tickets </a> " +
                            "    <div class=\"welcome-message\">\n" +
                            "        Home Page\n" +
                            "    </div>\n" +
                            "<form action=\"./fixtures\" method=\"POST\">\n" +
                            "  <label for=\"fixtureId\">Fixture id:</label><br>\n" +
                            "  <input type=\"text\" id=\"fixtureId\" name=\"fixtureId\" ><br>\n" +
                            "  <label for=\"homeTeam\">Home Team:</label><br>\n" +
                            "  <input type=\"text\" id=\"homeTeam\" name=\"homeTeam\"><br>\n" +
                            "  <label for=\"awayTeam\">Away Team:</label><br>\n" +
                            "  <input type=\"text\" id=\"awayTeam\" name=\"awayTeam\"><br>\n" +
                            "  <label for=\"fixtureTime\">Fixture Time:</label><br>\n" +
                            "  <input type=\"text\" id=\"fixtureTime\" name=\"fixtureTime\"><br>\n" +
                            "  <label for=\"fixtureDate\">Fixture Date:</label><br>\n" +
                            "  <input type=\"text\" id=\"fixtureDate\" name=\"fixtureDate\"><br><br>\n" +
                            "  <input type=\"submit\" value=\"Submit\">\n" +
                            "</form> " +
                            "<br><br> " +
                            " <a href=\"./logout\"> Logout </a> " +
                            "    <div class=\"fixture\">\n" +
                            "        <h2>Upcoming fixtures</h2>\n");
            print.write(fixtureBean.upcomingFixtures());

            print.write(
                    "    </div>\n" +
                            "</body>\n" +
                            "</html>\n");
        } else
            res.sendRedirect("./");
    }


}
