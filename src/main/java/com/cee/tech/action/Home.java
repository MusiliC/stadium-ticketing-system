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

            for (Cookie myCookie : cookies) {
                if (myCookie.getName().equals("username")) {
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
                            "</head>\n" +
                            "<style>\n" +
                            "      * {\n" +
                            "      margin: 0;\n" +
                            "      padding: 0;\n" +
                            "      box-sizing: border-box;\n" +
                            "    }\n" +
                            "    body{\n" +
                            "        width: 100%;\n" +
                            "        font-family: \"Mona Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n" +
                            "        font-size: 14px;\n" +
                            "    }\n" +
                            "    .navbarContainer{\n" +
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
                            ".mainContainer {\n" +
                            "      width: 83%;\n" +
                            "      margin: auto;\n" +
                            "      padding-top: 10px;\n" +
                            "      padding-bottom: 10px;\n" +
                            "      display: flex;      \n" +
                            "      justify-content: space-around;\n" +
                            "      height: 83vh;\n" +
                            "      align-items: center;\n" +
                            "      gap: 30px;\n" +
                            "    }\n" +
                            "    .heroSection {\n" +
                            "      width: 50%;\n" +
                            "      display: flex;\n" +
                            "      flex-direction: column;      \n" +
                            "      gap: 20px;\n" +
                            "    }\n" +
                            "    .sectionTitle {\n" +
                            "      font-size: 2.7rem;\n" +
                            "      font-weight: 600;\n" +
                            "      letter-spacing: 2px;\n" +
                            "      line-height: 4rem;\n" +
                            "     \n" +
                            "    }\n" +
                            "    .summary {\n" +
                            "      width: 70%;\n" +
                            "      color: #272829;\n" +
                            "      margin: 13px 0px;\n" +
                            "  \n" +
                            "    }\n" +
                            "    .blueText {\n" +
                            "      color: rgb(0, 53, 133);\n" +
                            "    }\n" +
                            "    .homeNormalButton{\n" +
                            "        padding: 12px 24px;\n" +
                            "        border-radius: 25px; \n" +
                            "        border:none;\n" +
                            "        background-color: rgb(10, 79, 182) ;\n" +
                            "        color: white;\n" +
                            "        cursor: pointer;\n" +
                            "        text-decoration: none;\n" +
                            "    }\n" +
                            "    .homeOutlineButton{\n" +
                            "        border:1px rgb(0, 53, 133) solid;\n" +
                            "        padding: 10px 20px;\n" +
                            "        border-radius: 25px;  \n" +
                            "        color: rgb(0, 53, 133);  \n" +
                            "        text-decoration: none;    \n" +
                            "    }\n" +
                            "    .homeOutlineButton:hover{\n" +
                            "        /* border:none; */\n" +
                            "        background-color: rgb(10, 79, 182) ;\n" +
                            "        color: white;\n" +
                            "        cursor: pointer;\n" +
                            "    }\n" +
                            "    .homeButtons{\n" +
                            "        display: flex;\n" +
                            "        gap: 20px;\n" +
                            "        align-items: center;\n" +
                            "    }\n" +
                            "    .heroImage {\n" +
                            "      width: 50%;\n" +
                            "    }\n" +
                            "    .imageContainer{\n" +
                            "      width: 100%;\n" +
                            "  \n" +
                            "    }\n" +
                            "    .bgImage{\n" +
                            "      width: 100%;\n" +
                            "    }"+
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

                     "  <div class=\"mainContainer\">\n" +
                            "      <div class=\"heroSection\">\n" +
                            "        <div class=\"sectionTitle\">\n" +
                            "          <p>\n" +
                            "            Experience The <br />\n" +
                            "            <span class=\"blueText\">Thrill of Live Sports </span> <br />\n" +
                            "            Like Never Before\n" +
                            "          </p>\n" +
                            "        </div>\n" +
                            "        <div>\n" +
                            "          <p class=\"summary\">\n" +
                            "            Experience the ultimate in live entertainment with our seamless\n" +
                            "            ticketing system. Get ready to secure your spot at the heart of the\n" +
                            "            action\n" +
                            "          </p>\n" +
                            "        </div>\n" +
                            "        <div class=\"homeButtons\">\n" +
                            "            <a href=\"./tickets\" class=\"homeOutlineButton\" >  My Tickets</a>\n" +
                            "            <a href=\"./fixtures\" class=\"homeNormalButton\">Upcoming Fixtures</a>\n" +
                            "        </div>\n" +
                            "      </div>\n" +
                            "      <div class=\"heroImage\">\n" +
                            "        <div class=\"imageContainer\">\n" +
                            "          <img class=\"bgImage\" src=\"./assets/stad.jpg\" alt=\"stadium\">\n" +
                            "        </div>\n" +
                            "      </div>\n" +
                            "    </div>" +
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
                            "</form> " );

            print.write(
                    "    </div>\n" +
                            "</body>\n" +
                            "</html>\n");
        } else
            res.sendRedirect("./");
    }


}
