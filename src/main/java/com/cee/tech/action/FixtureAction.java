package com.cee.tech.action;

import com.cee.tech.app.bean.FixtureBean;
import com.cee.tech.app.bean.FixtureBeanI;
import com.cee.tech.app.model.entity.Fixture;
import com.cee.tech.database.Database;
import com.cee.tech.utils.CookieUtils;
import com.cee.tech.view.html.AppPage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/fixtures")
public class FixtureAction extends BaseActionClass {

    private Fixture fixture = new Fixture();

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Database database = Database.getDbInstance();
        FixtureBeanI fixtureBean = new FixtureBean();


        renderPage(req, res, "    <div class=\"mainFixtureContainer\">\n" +
                "      <!-- top part -->\n" +
                "      <div class=\"topPart\">\n" +
                "        <div class=\"topPartTitle\">\n" +
                "          <p>Upcoming Fixtures</p>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <!-- bottom part  -->\n" +
                "      <div class=\"fixtureContainer\">\n" +
                "        <!-- each fixture div -->\n" +
                fixtureBean.upcomingFixtures() +

                "      </div>\n" +
                "    </div>");



    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Database database = Database.getDbInstance();


        serializeForm(fixture, req.getParameterMap());
        database.getFixtures().add(fixture);

        FixtureBeanI fixtureBean = new FixtureBean();

        renderPage(req, res, "    <div class=\"mainFixtureContainer\">\n" +
                "      <!-- top part -->\n" +
                "      <div class=\"topPart\">\n" +
                "        <div class=\"topPartTitle\">\n" +
                "          <p>Upcoming Fixtures</p>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <!-- bottom part  -->\n" +
                "      <div class=\"fixtureContainer\">\n" +
                "        <!-- each fixture div -->\n" +
                fixtureBean.upcomingFixtures() +

                "      </div>\n" +
                "    </div>");



    }
}