package com.cee.tech.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.cee.tech.utils.CookieUtils;
import com.cee.tech.utils.CustomLogger;
import com.cee.tech.view.html.AppPage;


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

            logger.log(Level.INFO, "********** " + accessCookie + "***************");

            new AppPage().renderHtml(req,res, firstLetter, " <div class=\"mainContainer\">\n" +
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
    }

}
