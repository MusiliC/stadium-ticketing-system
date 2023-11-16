package com.cee.tech.app;

import com.cee.tech.app.bean.BookTicketI;
import com.cee.tech.app.model.entity.Ticket;

public class BookTicketImpl implements BookTicketI {
    @Override
    public String allTickets() {
        return null;
    }

    @Override
    public Ticket bookTicket(Ticket ticket) throws Exception {
        return null;
    }

    @Override
    public void deleteTicket(Ticket ticket) {
        System.out.println("deleted");
    }
}
