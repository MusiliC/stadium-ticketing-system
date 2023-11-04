package com.cee.tech.app.bean;

import com.cee.tech.app.model.Fixture;
import com.cee.tech.database.Database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FixtureBean implements FixtureBeanI, Serializable {
    public  String upcomingFixtures(){
        List<Fixture> fixtures = Database.getDbInstance().getFixtures();

        StringBuilder tbBuilder = new StringBuilder();

        tbBuilder.append("<table><tr><th>Fixture ID</th> <th>Home Team</th> <th>Away Team</> <th>Fixture Time</th> <th>Fixture Date</th></tr>");

        for(Fixture fixture: fixtures)
            tbBuilder.append(fixture.tableRow());

        tbBuilder.append("</table>");

        return tbBuilder.toString();
    };
    public Fixture addUpdateFixture(Fixture fixture)throws  Exception{
      return  fixture;
    };

    public  void deleteFixture(Fixture fixture){
        System.out.println("Yaay");
    }
}
