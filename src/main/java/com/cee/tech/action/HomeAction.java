package com.cee.tech.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.cee.tech.utils.CookieUtils;
import com.cee.tech.utils.CustomLogger;



@WebServlet("/home")
public class HomeAction extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
            PrintWriter print = res.getWriter();
            CustomLogger logger = CustomLogger.getLoggerInstance();

            Cookie userCookie = CookieUtils.getCookieByName(req, "username");
            String accessCookie = null;
            String firstLetter = null;

            if (userCookie != null) {
                accessCookie = userCookie.getValue();
                firstLetter = accessCookie.substring(0, 1).toUpperCase();
            } else {
                System.out.println("Cookie not found");
            }

            //System.out.println("********** " + accessCookie + "***************");
            logger.log(Level.INFO, "********** " + accessCookie + "***************");


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
                            "       padding: 30px 0px;\n" +
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
                            ".lastPart{\n" +
                            "        display: flex;\n" +
                            "        align-items: center;\n" +
                            "        gap: 30px;\n" +
                            "    }\n" +
                            "    .profile{\n" +
                            "        padding: 12px 15px;\n" +
                            "        border-radius: 50%; \n" +
                            "        border:none;\n" +
                            "        background-color: rgb(10, 79, 182) ;\n" +
                            "        color: white;\n" +
                            "        font-weight: 600;\n" +
                            "    }" +
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
                            "    }" +
                            " .formMainContainer {\n" +
                            "      width: 83%;\n" +
                            "      margin: auto;\n" +
                            "      padding-top: 10px;\n" +
                            "      padding-bottom: 10px;\n" +
                            "    }\n" +
                            "    .formContainer {\n" +
                            "      width: 600px;\n" +
                            "      display: grid;\n" +
                            "      grid-template-columns: auto auto;\n" +
                            "      gap: 15px;\n" +
                            "      margin: 20px 0px;\n" +
                            "    }\n" +
                            "    .fixtureTitle {\n" +
                            "      font-size: 1.5rem;\n" +
                            "    }\n" +
                            "\n" +
                            "    .normalFormButton {\n" +
                            "      padding: 12px 24px;\n" +
                            "      border-radius: 25px;\n" +
                            "      border: none;\n" +
                            "      background-color: rgb(10, 79, 182);\n" +
                            "      color: white;\n" +
                            "      cursor: pointer;\n" +
                            "    }\n" +
                            "    .formInput {\n" +
                            "      display: flex;\n" +
                            "      flex-direction: column;\n" +
                            "      gap: 5px;\n" +
                            "      margin: 5px 0px;\n" +
                            "    }\n" +
                            "    .formInput input {\n" +
                            "      padding: 10px;\n" +
                            "      border-radius: 3px;\n" +
                            "      border: 1px solid lightgray;\n" +
                            "    }\n" +
                            "    .formInput input:focus {\n" +
                            "      outline: none;\n" +
                            "    }" +
                            " .fixtureStyling{\n" +
                            "      padding: 10px;\n" +
                            "      border-radius: 3px;\n" +
                            "      border: 1px solid lightgray;\n" +
                            "    }\n" +
                            "    .fixtureStyling:focus{\n" +
                            "      outline: none;\n" +
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
                            " <div class=\"lastPart\">\n" +
                            "          <p class=\"profile\" >  " +
                                firstLetter +
                            "</p>\n" +
                            "          <a href=\"./logout\" class=\"contactButton\"> LOGOUT </a>\n" +
                            "        </div>" +
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
                            "          <img class=\"bgImage\" src=\"https://images.unsplash.com/photo-1522778526097-ce0a22ceb253?auto=format&fit=crop&q=80&w=1470&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\" alt=\"stadium\">\n" +
                            "        </div>\n" +
                            "      </div>\n" +
                            "    </div>" +
                            " <div class=\"formMainContainer\">\n" +
                            "      <div class=\"createFixtureContainer\">\n" +
                            "        <p class=\"fixtureTitle\">Create Fixture</p>\n" +
                            "\n" +
                            "        <form action=\"./fixtures\" method=\"post\">\n" +
                            "          <div class=\"formContainer\">\n" +
                            "            <div class=\"formInput\">\n" +
                            "              <label for=\"fixtureTime\">Fixture Time:</label>\n" +
                            "              <input type=\"time\" name=\"fixtureTime\" id=\"fixtureTime\" />\n" +
                            "            </div>\n" +
                            "            <div class=\"formInput\">\n" +
                            "              <label for=\"fixtureLocation\">Location:</label>\n" +
                            "              <input type=\"text\" name=\"fixtureLocation\" id=\"fixtureLocation\" />\n" +
                            "            </div>\n" +
                            "            <div class=\"formInput\">\n" +
                            "              <label for=\"homeTeam\">Home Team:</label>\n" +
                            "              <input type=\"text\" name=\"homeTeam\" id=\"homeTeam\" />\n" +
                            "            </div>\n" +
                            "            <div class=\"formInput\">\n" +
                            "              <label for=\"awayTeam\">Away Team:</label>\n" +
                            "              <input type=\"text\" name=\"awayTeam\" id=\"awayTeam\" />\n" +
                            "            </div>\n" +
                            "            <div class=\"formInput\">\n" +
                            "              <label for=\"fixtureDate\">Fixture Date:</label>\n" +
                            "              <input type=\"date\" name=\"fixtureDate\" id=\"fixtureDate\" />\n" +
                            "            </div>\n" +
                            "  <div class=\"formInput\">\n" +
                            "              <label for=\"fixtureType\">Fixture Type:</label>\n" +
                            "              <select name=\"fixtureType\" id=\"fixtureType\" class=\"fixtureStyling\">\n" +
                            "                <option value=\"\" selected disabled hidden>Choose fixture type</option>\n" +
                            "                <option value=\"Kenya Premier League\">Kenya Premier League</option>\n" +
                            "                <option value=\"Mozzart Cup\">Mozzart Cup</option>\n" +
                            "                <option value=\"CAF Champions League\">CAF Champions League</option>\n" +
                            "                <option value=\"CAF confederation\">CAF confederation</option>\n" +
                            "              </select>\n" +
                            "            </div>"+
                            "          </div>\n" +
                            "          <input class=\"normalFormButton\" type=\"submit\" value=\"Post Fixture\" />\n" +
                            "        </form>\n" +
                            "      </div>\n" +
                            "    </div>");

            print.write(
                    "    </div>\n" +
                            "</body>\n" +
                            "</html>\n");
       
    }


}
