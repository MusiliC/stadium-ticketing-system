package com.cee.tech.app.bean;

import com.cee.tech.app.model.Fixture;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FixtureBean implements FixtureBeanI, Serializable {
    public  String upcomingFixtures(){
        List<Fixture> fixtures = new ArrayList<>();
        fixtures.add(new Fixture("001","Tusker fc", "Ulinzi Stars", "21:00 EAT", "22/10/2023"));
        fixtures.add(new Fixture("002","Gor Mahia", "Shabana","17:00 EAT", "27/10/2023"));
        fixtures.add(new Fixture("003","Kariobangi Sharks","Kakamega Homeboyz",  "14:00 EAT", "1/11/2023"));
        fixtures.add(new Fixture("004","AFC Leopards","Muhoroni Youth", "15:00 EAT", "3/11/2023"  ));
        fixtures.add(new Fixture("005","Muranga Seals","Bidco United", "16:00 EAT", "5/11/2023" ) );


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
