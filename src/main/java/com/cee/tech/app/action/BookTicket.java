package com.cee.tech.app.action;


import com.cee.tech.app.model.entity.Ticket;
import com.cee.tech.view.html.HtmlComponents;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BookTicket extends BaseActionClass {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        renderPage(req,res, "<div class=\"mainTicketBookContainer\"> \n" +
                "\n" +
                HtmlComponents.ticketForm(Ticket.class) +
                "    </div>");


    }
}
