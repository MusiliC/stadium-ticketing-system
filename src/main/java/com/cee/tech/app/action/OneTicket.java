package com.cee.tech.app.action;

import com.cee.tech.utils.CookieUtils;
import com.cee.tech.utils.CustomLogger;
import com.cee.tech.view.html.AppPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("tickets/id")
public class OneTicket extends BaseActionClass {

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

//        renderPage(req,res,);

        new AppPage().renderHtml(req,res, firstLetter, "<div class=\"ticketBodyContainer\">\n" +
                "<div class=\"ticketDetailsTitle\">\n" +
                        "        <p>Ticket Details</p>\n" +
                        "      </div>" +
                "      <div class=\"mainOneTicketContainer\">\n" +
                "        <div class=\"oneTicketTop\">\n" +
                "          <div class=\"topOneTicketPart\">\n" +
                "            <div class=\"imagePart\">\n" +
                "              <img\n" +
                "                src=\"https://footballkenya.org/wp-content/uploads/2019/09/FKF-Website-Header-Logo-300x120.png\"\n" +
                "                alt=\"Logo\"\n" +
                "              />\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"bottomTicketPart\">\n" +
                "            <div class=\"gameStyling\">\n" +
                "              <div class=\"fixtureType\">\n" +
                "                <p class=\"kpl\">Kenya Premier League</p>\n" +
                "                <p class=\"game\">Gor Mahia vs Afc Leopards</p>\n" +
                "                <p class=\"date\">3/11/2023</p>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"fineTicketDetails\">\n" +
                "              <div class=\"leftPart\">\n" +
                "                <div class=\"ticketType\">\n" +
                "                  <p>Type: VIP</p>\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"amount\">\n" +
                "                  <p>Amount: 500</p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "              <div class=\"rightPart\">\n" +
                "                <div class=\"ticketNumber\">\n" +
                "                  <p>Ticket Number: 1001</p>\n" +
                "                </div>\n" +
                "                <div class=\"kickOff\">\n" +
                "                  <p>Kick Off: 1300 hrs</p>\n" +
                "                </div>\n" +
                "                <div class=\"location\">\n" +
                "                  <p>Location: Kasarani</p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"ticketButtons\">\n" +
                "        <a href=\"/eticket/tickets\" class=\"ticketNormalButton\">Back</a>\n" +
                "        <a href=\"#\" class=\"ticketOutlineButton\">Download</a>\n" +
                "      </div>\n" +
                "    </div>");
    }
}