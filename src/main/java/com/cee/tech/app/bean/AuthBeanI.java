package com.cee.tech.app.bean;

import com.cee.tech.app.model.User;

public interface AuthBeanI {
    public User authenticateUser(User loginUser);
}
