package com.cee.tech.app.bean;

import com.cee.tech.app.model.entity.User;
import com.cee.tech.database.Database;

public class UserBean implements UserBeanI{
    Database database = Database.getDbInstance();
    @Override
    public boolean registerUser(User user) {
        if (user.getPassword().equals(user.getConfirmPassword()))
            database.getUsers().add(new User("100", user.getUsername(),user.getPassword()));
        return true;
    };

    @Override
    public boolean unregisterUser(User user) {
    return false;
    }
}
