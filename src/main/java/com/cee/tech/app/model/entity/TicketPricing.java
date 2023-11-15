package com.cee.tech.app.model.entity;

import java.io.Serializable;

public class TicketPricing implements Serializable {
    private String ticketType;
    private String ticketAmountNormal;

    private String ticketAmountVIP;

    public TicketPricing() {
    }

    public TicketPricing(String ticketType, String ticketAmountNormal, String ticketAmountVIP) {
        this.ticketType = ticketType;
        this.ticketAmountNormal = ticketAmountNormal;
        this.ticketAmountVIP = ticketAmountVIP;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketAmountNormal() {
        return ticketAmountNormal;
    }

    public void setTicketAmountNormal(String ticketAmountNormal) {
        this.ticketAmountNormal = ticketAmountNormal;
    }

    public String getTicketAmountVIP() {
        return ticketAmountVIP;
    }

    public void setTicketAmountVIP(String ticketAmountVIP) {
        this.ticketAmountVIP = ticketAmountVIP;
    }






}
