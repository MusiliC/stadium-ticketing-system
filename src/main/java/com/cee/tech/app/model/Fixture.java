package com.cee.tech.app.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class Fixture implements Serializable {

    private String fixtureId;
    private String fixtureType;
    private String fixtureTime;
    private String fixtureLocation;
    private String homeTeam;
    private String awayTeam;
    private String fixtureDate;


    public String getFixtureType() {
        return fixtureType;
    }



    public Fixture(String fixtureType, String fixtureTime, String fixtureLocation, String homeTeam, String awayTeam, String fixtureDate) {
        this.fixtureType = fixtureType;
        this.fixtureTime = fixtureTime;
        this.fixtureLocation = fixtureLocation;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.fixtureDate = fixtureDate;
    }

    public Fixture(String fixtureId, String fixtureType, String fixtureTime, String fixtureLocation, String homeTeam, String awayTeam, String fixtureDate) {
        this.fixtureId = fixtureId;
        this.fixtureType = fixtureType;
        this.fixtureTime = fixtureTime;
        this.fixtureLocation = fixtureLocation;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.fixtureDate = fixtureDate;
    }

    public String getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(String fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getFixtureTime() {
        return fixtureTime;
    }

    public void setFixtureTime(String fixtureTime) {
        this.fixtureTime = fixtureTime;
    }

    public String getFixtureDate() {
        return fixtureDate;
    }

    public void setFixtureDate(String fixtureDate) {
        this.fixtureDate = fixtureDate;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getFixtureLocation() {
        return fixtureLocation;
    }

    public void setFixtureLocation(String fixtureLocation) {
        this.fixtureLocation = fixtureLocation;
    }
    public void setFixtureType(String fixtureType) {
        this.fixtureType = fixtureType;
    }

    public Fixture() {
    }

//  <div class="oneFixture">
//          <div class="teams">
//            <p>15:00 EAT</p>
//    <p>MISC Kasarani</p>
//          </div>
//          <div class="teams">
//    <p>Gor Mahia</p>
//            <p>Tusker</p>
//          </div>
//          <div class="date">
//            <p>12/03/2023</p>
//          </div>
//          <div class="ticket">
//            <div class="outlineButton">Buy Ticket</div>
//          </div>
//        </div>

    public String tableRow() {
        StringBuilder tbBuilder = new StringBuilder();
        tbBuilder.append("<div class=\"oneFixture\">");
        tbBuilder.append("<div class=\"fixture\">");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getFixtureType())).append("</td>");
        tbBuilder.append(" </div>");
        tbBuilder.append("  <div class=\"timeLocation\">");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getFixtureTime())).append("</p>");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getFixtureLocation())).append("</p>");
        tbBuilder.append(" </div>");
        tbBuilder.append("<div class=\"teams\">");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getHomeTeam())).append("</p>");
        tbBuilder.append("<p>").append(StringUtils.trimToEmpty(getAwayTeam())).append("</p>");
        tbBuilder.append(" </div>");
        tbBuilder.append("<div class=\"date\">");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getFixtureDate())).append("</td>");
        tbBuilder.append(" </div>");
        tbBuilder.append("<div class=\"ticket\">");
        tbBuilder.append("  <div class=\"outlineTicketButton\">Buy Ticket</div>");
        tbBuilder.append("</div>");
        tbBuilder.append("</div>");
        return tbBuilder.toString();

    }

}
