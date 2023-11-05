package com.cee.tech.action;

import com.cee.tech.app.bean.FixtureBean;
import com.cee.tech.app.bean.FixtureBeanI;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/tickets")
public class Ticket extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        if (StringUtils.isNotBlank((String) httpSession.getAttribute("LoginId"))) {
            ServletContext context = getServletContext();
            FixtureBeanI fixtureBean = new FixtureBean();
            PrintWriter print = res.getWriter();

            print.write(
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                            "    <title>My Tickets</title>\n" +
                            "</head>\n" +
                            "<style>\n" +
                            "      * {\n" +
                            "      margin: 0;\n" +
                            "      padding: 0;\n" +
                            "      box-sizing: border-box;\n" +
                            "    }\n" +
                            "    body {\n" +
                            "      width: 100%;\n" +
                            "      font-family: \"Mona Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n" +
                            "    }\n" +
                            " .navbarContainer{\n" +
                            "        width: 83%;\n" +
                            "        margin: auto;\n" +
                            "       padding: 20px 0px;\n" +
                            "    }\n" +
                            "    .title{\n" +
                            "        font-size: 1.2rem;\n" +
                            "\n" +
                            "    }\n" +
                            "    .title a{\n" +
                            "        color:  rgb(0, 53, 133);\n" +
                            "        text-decoration: none;\n" +
                            "        font-weight: 600;\n" +
                            "    }\n" +
                            "    .navClass{\n" +
                            "        display: flex;\n" +
                            "        justify-content: space-between;\n" +
                            "        width: 100%;\n" +
                            "        align-items: center;\n" +
                            "    }\n" +
                            "    .links{\n" +
                            "        display: flex;\n" +
                            "        gap: 40px;\n" +
                            "        \n" +
                            "    }\n" +
                            "    .links,a{\n" +
                            "        color: #272829;\n" +
                            "        text-decoration: none;\n" +
                            "        \n" +
                            "    }\n" +
                            "    .links a:hover{\n" +
                            "        color:  rgb(0, 53, 133);\n" +
                            "        \n" +
                            "    }\n" +
                            "    .contactButton{\n" +
                            "        border:1px rgb(0, 53, 133) solid;\n" +
                            "        padding: 8px 17px;\n" +
                            "        border-radius: 25px;  \n" +
                            "        color: rgb(0, 53, 133);      \n" +
                            "    }\n" +
                            "    .contactButton a{\n" +
                            "        text-decoration: none;\n" +
                            "        color: rgb(0, 53, 133);    \n" +
                            "    }\n" +
                            "    .contactButton a:hover{\n" +
                            "        color: white;   \n" +
                            "    }\n" +
                            "    .contactButton:hover{\n" +
                            "        /* border:none; */\n" +
                            "        background-color: rgb(10, 79, 182) ;\n" +
                            "        color: white;\n" +
                            "        cursor: pointer;\n" +
                            "    }\n" +
                            "    .mainTicketContainer {\n" +
                            "      width: 83%;\n" +
                            "      margin: auto;\n" +
                            "      padding-top: 10px;\n" +
                            "      padding-bottom: 10px; \n" +
                            "      display: flex;\n" +
                            "      justify-content: center;\n" +
                            "      align-items: center;\n" +
                            "      height: 70vh;\n" +
                            "    }\n" +
                            "    .fixtureCard{\n" +
                            "        background-color: rgb(0, 53, 133) ;\n" +
                            "        color: white;\n" +
                            "        padding: 100px;\n" +
                            "        box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2);\n" +
                            "    }\n" +
                            "    .fixtureCard p{\n" +
                            "        font-size: 2rem;\n" +
                            "        font-weight: 600;\n" +
                            "        margin: 5px 0px;\n" +
                            "        text-align: start;\n" +
                            "    }\n" +
                            "</style>" +
                            "<body>\n" +
                            "  <div class=\"navbarContainer\" >\n" +
                            "        <nav class=\"navClass\">\n" +
                            "            <div class=\"title\">\n" +
                            "                <a href=\"/\">Etciket</a>\n" +
                            "            </div>\n" +
                            "            <div class=\"links\" >\n" +
                            "               <a href=\"./home\">HOME</a>\n" +
                            "               <a href=\"./tickets\">TICKETS</a>\n" +
                            "               <a href=\"./fixtures\">FIXTURES</a>\n" +
                            "            </div>\n" +
                            "            <a href=\"./logout\" class=\"contactButton\">\n" +
                            "                LOGOUT\n" +
                            "            </a>\n" +
                            "        </nav>\n" +
                            "    </div>" +
                          "    <div class=\"mainTicketContainer\">\n" +
                            "        <div class=\"fixtureCard\">\n" +
                            "            <p>My Tickets Page</p>\n" +
                            "            <p>Implementing next..   &#128515 </p>\n" +
                            "        </div>\n" +
                            "    </div>");

            print.write(
                    "    </div>\n" +
                            "</body>\n" +
                            "</html>\n");
        } else
            res.sendRedirect("./");
    }


}
