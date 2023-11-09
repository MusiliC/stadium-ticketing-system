package com.cee.tech.app.bean;

import com.cee.tech.app.model.User;

public interface UserBeanI {
    boolean registerUser(User user);

    boolean unregisterUser(User user);
}
