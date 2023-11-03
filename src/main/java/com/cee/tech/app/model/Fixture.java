package com.cee.tech.app.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class Fixture implements Serializable {

    private String fixtureId;
    private String homeTeam;
    private String awayTeam;
    private String fixtureTime;
    private String fixtureDate;

    public Fixture() {
    }

    public Fixture(String fixtureId, String homeTeam, String awayTeam, String fixtureTime, String fixtureDate) {
        this.fixtureId = fixtureId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.fixtureTime = fixtureTime;
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

    public String tableRow() {
        StringBuilder tbBuilder = new StringBuilder();
        tbBuilder.append("<tr>");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getFixtureId())).append("</td>");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getHomeTeam())).append("</td>");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty( getAwayTeam())).append("</td>");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty(getFixtureTime())).append("</td>");
        tbBuilder.append("<td>").append(StringUtils.trimToEmpty( getFixtureDate())).append("</td>");
        tbBuilder.append("</tr>");
        return tbBuilder.toString();

    }

}
