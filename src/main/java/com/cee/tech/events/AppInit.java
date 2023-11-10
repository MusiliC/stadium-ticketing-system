package com.cee.tech.events;

import com.cee.tech.app.model.entity.Fixture;
import com.cee.tech.app.model.entity.User;
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

        database.getFixtures().add(new Fixture("Kenya Premier League","17:00 EAT", "Nyayo","Gor Mahia", "Shabana","27/10/2023"));
        database.getFixtures().add(new Fixture("Mozzart Cup","14:00 EAT", "MISC Kasarani","Kariobangi Sharks","Kakamega Homeboyz",  "1/11/2023"));
        database.getFixtures().add(new Fixture("Caf Champions League","15:00 EAT","St Sebastian","Murang'a Seals","Muhoroni Youth",  "3/11/2023"  ));

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
