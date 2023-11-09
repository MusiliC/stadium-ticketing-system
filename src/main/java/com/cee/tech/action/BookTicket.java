package com.cee.tech.action;


import com.cee.tech.utils.CookieUtils;
import com.cee.tech.view.html.AppPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BookTicket extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        Cookie userCookie = CookieUtils.getCookieByName(req, "username");
        String accessCookie = null;
        String firstLetter = null;

        if (userCookie != null) {
            accessCookie = userCookie.getValue();
            firstLetter = accessCookie.substring(0, 1).toUpperCase();
        } else {
            System.out.println("Cookie not found");
        }

        new AppPage().renderHtml(req,res,firstLetter, "    <div class=\"mainTicketBookContainer\">      \n" +
                "\n" +
                "        <form action=\"#\" method=\"post\">\n" +
                "          <p class=\"fixtureTitle\">Book a ticket</p>\n" +
                "          <div class=\"formTicketContainer\">\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"clientName\">Name:</label>\n" +
                "              <input type=\"text\" name=\"clientName\" id=\"clientName\" />\n" +
                "            </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"clientEmail\">Email:</label>\n" +
                "              <input type=\"text\" name=\"clientEmail\" id=\"clientEmail\" />\n" +
                "            </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"number\">Phone Number:</label>\n" +
                "              <input type=\"text\" name=\"number\" id=\"number\" />\n" +
                "            </div>\n" +
                "            <div class=\"formInput\">\n" +
                "                <label for=\"ticketType\">Ticket Type:</label>\n" +
                "                <select name=\"ticketType\" id=\"ticketType\" class=\"fixtureStyling\">\n" +
                "                  <option value=\"\" selected disabled hidden>Choose ticket type</option>\n" +
                "                  <option value=\"normal\">Normal</option>\n" +
                "                  <option value=\"VIP\">VIP</option>               \n" +
                "                </select>\n" +
                "              </div>\n" +
                "            <div class=\"formInput\">\n" +
                "              <label for=\"fixtureQuantity\">Number of tickets:</label>\n" +
                "              <input type=\"number\" value=\"1\" name=\"fixtureQuantity\" id=\"fixtureQuantity\" />\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        <div class=\"ticketButtons\">\n" +
                           "<a href=\"./fixtures\" class=\"homeOutlineButton\" > Cancel</a>\n" +
                          "<input class=\"normalFormButton\" type=\"submit\" value=\"Book Ticket\" />\n" +
                        "</div>" +
                "        </form>\n" +
                "    </div>");
    }
}
