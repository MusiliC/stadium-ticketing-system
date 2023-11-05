package com.cee.tech.action;

import com.cee.tech.app.bean.FixtureBean;
import com.cee.tech.app.bean.FixtureBeanI;
import com.cee.tech.app.model.Fixture;
import com.cee.tech.database.Database;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fixtures")
public class FixtureAction extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Database database = Database.getDbInstance();

        database.getFixtures().add(new Fixture(req.getParameter("fixtureId"), req.getParameter("fixtureTime"), req.getParameter("fixtureLocation"), req.getParameter("homeTeam"), req.getParameter("awayTeam"), req.getParameter("fixtureDate")));

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("LoginId"))) {
            ServletContext context = getServletContext();
            FixtureBeanI fixtureBean = new FixtureBean();
            PrintWriter print = res.getWriter();

            print.write(
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "  <head>\n" +
                            "    <meta charset=\"UTF-8\" />\n" +
                            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                            "    <title>Document</title>\n" +
                            "  </head>\n" +
                            "  <style>\n" +
                            "    * {\n" +
                            "      margin: 0;\n" +
                            "      padding: 0;\n" +
                            "      box-sizing: border-box;\n" +
                            "    }\n" +
                            "    body {\n" +
                            "      width: 100%;\n" +
                            "      height: 90vh;\n" +
                            "      font-family: \"Mona Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n" +
                            "      font-size: 15px;\n" +
                            "    }\n" +
                            "    .outlineButton{\n" +
                            "        border:1px rgb(0, 53, 133) solid;\n" +
                            "        padding: 10px 20px;\n" +
                            "        border-radius: 25px;  \n" +
                            "        color: rgb(0, 53, 133);      \n" +
                            "    }\n" +
                            "    .outlineButton:hover{\n" +
                            "        /* border:none; */\n" +
                            "        background-color: rgb(10, 79, 182) ;\n" +
                            "        color: white;\n" +
                            "        cursor: pointer;\n" +
                            "    }\n" +
                            "  \n" +
                            "    .topPart {\n" +
                            "      height: 170px;\n" +
                            "      background: rgb(28, 85, 172);\n" +
                            "      margin-bottom: 30px;\n" +
                            "      display: flex;\n" +
                            "      align-items: center;\n" +
                            "    }\n" +
                            "    .topPartTitle{\n" +
                            "        width: 70%;\n" +
                            "        margin: auto;\n" +
                            "    }\n" +
                            "    .topPartTitle p{\n" +
                            "        color: white;\n" +
                            "        font-size: 2.5rem;\n" +
                            "        font-weight: 600;\n" +
                            "        font-style: italic;\n" +
                            "    }\n" +
                            "    .fixtureContainer {\n" +
                            "      width: 70%;\n" +
                            "      margin: auto;\n" +
                            "    }\n" +
                            "    .oneFixture {\n" +
                            "      display: flex;\n" +
                            "      justify-content: space-between;\n" +
                            "      align-items: center;\n" +
                            "      padding: 18px 0px;\n" +
                            "      color: #272829;\n" +
                            "      border-bottom: 1px solid #7c7c7c;\n" +
                            "    }\n" +
                            "    .oneFixture:hover {\n" +
                            "      cursor: pointer;\n" +
                            "      background-color: rgb(238, 238, 238);\n" +
                            "      padding: 18px 5px;\n" +
                            "      color: black;\n" +
                            "    }\n" +
                            "    .teams {\n" +
                            "      display: flex;\n" +
                            "      flex-direction: column;\n" +
                            "      gap: 7px;\n" +
                            "    }\n" +
                            "  </style>"+
                            "<body>\n" +
                            " <div class=\"mainContainer\">\n" +
                            "      <!-- top part -->\n" +
                            "      <div class=\"topPart\">\n" +
                            "        <div class=\"topPartTitle\">\n" +
                            "          <p>Upcoming Fixtures</p>\n" +
                            "        </div>\n" +
                            "      </div>\n" +
                            "      <!-- bottom part  -->\n" +
                            "      <div class=\"fixtureContainer\">");
                             print.write(fixtureBean.upcomingFixtures());
                             print.write(
                            " </div>\n" +
                            "    </div>"+
                            "</body>\n" +
                            "</html>\n");
        }
    }
}