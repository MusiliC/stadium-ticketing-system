package com.cee.tech.app.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class Fixture implements Serializable {

    private String fixtureId;
    private String fixtureTime;
    private  String fixtureLocation;
    private String homeTeam;
    private String awayTeam;

    private String fixtureDate;

    public Fixture() {
    }

    public Fixture(String fixtureId, String fixtureTime, String fixtureLocation, String homeTeam, String awayTeam, String fixtureDate) {
        this.fixtureId = fixtureId;
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
