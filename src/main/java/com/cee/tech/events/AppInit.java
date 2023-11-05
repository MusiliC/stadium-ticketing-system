package com.cee.tech.events;

import com.cee.tech.app.model.Fixture;
import com.cee.tech.app.model.User;
import com.cee.tech.database.Database;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInit implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("***************** Initializing Database **********************");

        Database database = Database.getDbInstance();
        database.getUsers().add(new User(0L, "Musili", "Admin123"));
        database.getUsers().add(new User(1L, "Cee", "Cee123"));
        database.getUsers().add(new User(2L, "Mahrez", "Mahrez123"));


        database.getFixtures().add(new Fixture("001","Tusker fc", "Ulinzi Stars","", "21:00 EAT", "22/10/2023"));
        database.getFixtures().add(new Fixture("002","Gor Mahia", "Shabana","17:00 EAT", "27/10/2023",""));
        database.getFixtures().add(new Fixture("003","Kariobangi Sharks","Kakamega Homeboyz",  "14:00 EAT", "1/11/2023", ""));
        database.getFixtures().add(new Fixture("004","AFC Leopards","Muhoroni Youth", "15:00 EAT", "3/11/2023" ,"" ));
        database.getFixtures().add(new Fixture("005","Muranga Seals","Bidco United", "16:00 EAT", "5/11/2023" ,"") );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println();
        System.out.println();
        System.out.println("**************App killed*****************");
        System.out.println();
        System.out.println();
    }
}
