package com.cee.tech.action.adminActions;

import com.cee.tech.action.BaseActionClass;
import com.cee.tech.app.bean.FixtureBeanI;
import com.cee.tech.app.bean.adminbean.FixtureAdminBean;
import com.cee.tech.app.model.entity.Fixture;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminfixtures")
public class AdminFixtures extends BaseActionClass {
    FixtureBeanI adminFixtureBean = new FixtureAdminBean();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        renderAdminPage(req, res, "    <div class=\"mainFixtureContainer\">\n" +
                "      <!-- top part -->\n" +
                "      <!-- bottom part  -->\n" +
                "      <div class=\"fixtureAdminContainer\">\n" +
                "        <!-- each fixture div -->\n" +
                adminFixtureBean.upcomingFixtures() +

                "      </div>\n" +
                "    </div>");

    }
}
