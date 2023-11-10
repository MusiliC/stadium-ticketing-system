package com.cee.tech.action;


import com.cee.tech.app.model.entity.Fixture;
import com.cee.tech.app.model.entity.Ticket;
import com.cee.tech.utils.CookieUtils;
import com.cee.tech.view.html.AppPage;
import com.cee.tech.view.html.HtmlComponents;

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

        new AppPage().renderHtml(req,res,firstLetter, "<div class=\"mainTicketBookContainer\">      \n" +
                "\n" +
                HtmlComponents.ticketForm(Ticket.class) +
                "    </div>");
    }
}