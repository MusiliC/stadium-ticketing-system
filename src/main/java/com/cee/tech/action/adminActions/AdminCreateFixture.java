package com.cee.tech.action.adminActions;

import com.cee.tech.action.BaseActionClass;
import com.cee.tech.utils.CookieUtils;
import com.cee.tech.utils.CustomLogger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/admin/createfixture")
public class AdminCreateFixture extends BaseActionClass {

    public void  doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        CustomLogger logger = CustomLogger.getLoggerInstance();

        Cookie userCookie = CookieUtils.getCookieByName(req, "username");
        String accessCookie = null;
        String firstLetter = null;

        if (userCookie != null) {
            accessCookie = userCookie.getValue();
            firstLetter = accessCookie.substring(0, 1).toUpperCase();
        } else {
            System.out.println("Cookie not found");
        }


//        renderAdminPage();
    }
}
