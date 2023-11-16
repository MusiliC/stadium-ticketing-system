package com.cee.tech.app.bean;

import com.cee.tech.app.model.entity.User;
import com.cee.tech.database.Database;

import java.util.List;

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

    @Override
    public String allRegisteredUsers() {
        List<User> users = Database.getDbInstance().getUsers();

        StringBuilder tbBuilder = new StringBuilder();
        tbBuilder.append("<table>");
        tbBuilder.append("<tr>");
        tbBuilder.append("  <th>Username</th>\n" +
                "          <th>VIP tickets</th>\n" +
                "          <th>Normal tickets</th>\n" +
                "          <th>Action</th>");
        tbBuilder.append("</tr>");
        for (User user: users){
            tbBuilder.append(user.UserDataTable());
        }
        tbBuilder.append("</table>");
        return tbBuilder.toString();
    }
}
