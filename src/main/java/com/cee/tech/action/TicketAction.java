package com.cee.tech.action;

import com.cee.tech.utils.CookieUtils;
import com.cee.tech.view.html.AppPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tickets")
public class TicketAction extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        Cookie userCookie = CookieUtils.getCookieByName(req, "username");
        String accessCookie = null;
        String firstLetter = null;

        if (userCookie != null) {
            accessCookie = userCookie.getValue();
            firstLetter = accessCookie.substring(0, 1).toUpperCase();
        } else {
            System.out.println("Cookie not found");
        }

        new AppPage().renderHtml(req, res, firstLetter, " <div class=\"mainTicketContainer\">\n" +
                "        <div class=\"fixtureCard\">\n" +
                "            <p>My Tickets Page</p>\n" +
                "            <p>Implementing next..   &#128515 </p>\n" +
                "        </div>\n" +
                "    </div>");


    }
}