package com.cee.tech.database;

import com.cee.tech.app.model.entity.Fixture;
import com.cee.tech.app.model.entity.User;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database implements Serializable {

    private  static  Database dbInstance;

    private  Database(){};

    private  String databaseCreatedAt;

    public  static Database getDbInstance(){
        if(dbInstance == null) {
            dbInstance = new Database();
            dbInstance.databaseCreatedAt = DateFormat.getTimeInstance().format(new Date());
            System.out.println( "DB created at: " + dbInstance.getDatabaseCreatedAt());
        }
        return  dbInstance;
    }
    public String getDatabaseCreatedAt() {
        return databaseCreatedAt;
    }


    private List<User> users = new ArrayList<>();
    private  List<Fixture> fixtures = new ArrayList<>();

    public List<Fixture> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixture> fixtures) {
        this.fixtures = fixtures;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
