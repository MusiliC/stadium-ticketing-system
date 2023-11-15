package com.cee.tech.action.adminActions;

import com.cee.tech.action.BaseActionClass;
import com.cee.tech.app.model.entity.Fixture;
import com.cee.tech.view.html.HtmlComponents;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminAction extends BaseActionClass {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, " <div class=\"formMainContainer\">\n" +
                "      <div class=\"createFixtureContainer\">\n" +
                "        <p class=\"fixtureTitle\">Create Fixture</p>\n" +
                "\n" +
                HtmlComponents.form(Fixture.class) +
                "      </div>\n" +
                "    </div>");

    }

}
