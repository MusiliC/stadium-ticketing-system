package com.cee.tech.action;
import com.cee.tech.app.bean.FixtureBean;
import com.cee.tech.app.bean.FixtureBeanI;
import com.cee.tech.app.model.Fixture;
import com.cee.tech.database.Database;
import com.cee.tech.utils.CookieUtils;
import com.cee.tech.view.html.AppPage;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/fixtures")
public class FixtureAction extends BaseActionClass {

    private  Fixture fixture = new Fixture();
    public String displayNavAndFixtures(){
        return (
                "  <head>\n" +
                        "    <meta charset=\"UTF-8\" />\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                        "    <title>Fixtures</title>\n" +
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
                        "    .navbarContainer{\n" +
                        "        width: 83%;\n" +
                        "        margin: auto;\n" +
                        "       padding: 30px 0px;\n" +
                        "    }\n" +
                        "    .title{\n" +
                        "        font-size: 1.2rem;\n" +
                        "\n" +
                        "    }\n" +
                        "    .title a{\n" +
                        "        color:  rgb(0, 53, 133);\n" +
                        "        text-decoration: none;\n" +
                        "        font-weight: 600;\n" +
                        "    }\n" +
                        "    .navClass{\n" +
                        "        display: flex;\n" +
                        "        justify-content: space-between;\n" +
                        "        width: 100%;\n" +
                        "        align-items: center;\n" +
                        "    }\n" +
                        "    .links{\n" +
                        "        display: flex;\n" +
                        "        gap: 40px;\n" +
                        "        \n" +
                        "    }\n" +
                        "    .links,a{\n" +
                        "        color: #272829;\n" +
                        "        text-decoration: none;\n" +
                        "        \n" +
                        "    }\n" +
                        "    .links a:hover{\n" +
                        "        color:  rgb(0, 53, 133);\n" +
                        "        \n" +
                        "    }\n" +
                        "    .contactButton{\n" +
                        "        border:1px rgb(0, 53, 133) solid;\n" +
                        "        padding: 8px 17px;\n" +
                        "        border-radius: 25px;  \n" +
                        "        color: rgb(0, 53, 133);      \n" +
                        "    }\n" +
                        "    .contactButton a{\n" +
                        "        text-decoration: none;\n" +
                        "        color: rgb(0, 53, 133);    \n" +
                        "    }\n" +
                        "    .contactButton a:hover{\n" +
                        "        color: white;   \n" +
                        "    }\n" +
                        ".lastPart{\n" +
                        "        display: flex;\n" +
                        "        align-items: center;\n" +
                        "        gap: 30px;\n" +
                        "    }\n" +
                        "    .profile{\n" +
                        "        padding: 12px 15px;\n" +
                        "        border-radius: 50%; \n" +
                        "        border:none;\n" +
                        "        background-color: rgb(10, 79, 182) ;\n" +
                        "        color: white;\n" +
                        "        font-weight: 600;\n" +
                        "    }" +
                        "    .contactButton:hover{\n" +
                        "        /* border:none; */\n" +
                        "        background-color: rgb(10, 79, 182) ;\n" +
                        "        color: white;\n" +
                        "        cursor: pointer;\n" +
                        "    }\n" +
                        "    .fixtureContainer {\n" +
                        "      width: 83%;\n" +
                        "      margin: auto;\n" +
                        "    }\n" +
                        "    .outlineTicketButton{\n" +
                        "        border:1px rgb(0, 53, 133) solid;\n" +
                        "        padding: 10px 20px;\n" +
                        "        border-radius: 25px;  \n" +
                        "        color: rgb(0, 53, 133);      \n" +
                        "    }\n" +
                        "    .outlineTicketButton:hover{\n" +
                        "        /* border:none; */\n" +
                        "        background-color: rgb(10, 79, 182) ;\n" +
                        "        color: white;\n" +
                        "        cursor: pointer;\n" +
                        "    }\n" +
                        "  \n" +
                        "    .topPart {\n" +
                        "      height: 200px;\n" +
                        "      background: rgb(28, 85, 172);\n" +
                        "      margin-bottom: 30px;\n" +
                        "      display: flex;\n" +
                        "      align-items: center;\n" +
                        "    }\n" +
                        "    .topPartTitle{\n" +
                        "        width: 83%;\n" +
                        "        margin: auto;\n" +
                        "    }\n" +
                        "    .topPartTitle p{\n" +
                        "        color: white;\n" +
                        "        font-size: 2.5rem;\n" +
                        "        font-weight: 600;\n" +
                        "        font-style: italic;\n" +
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
                        " .fixture{\n" +
                        "     width: 200px;     \n" +
                        "    }\n" +
                        "     .timeLocation, .teams{     \n" +
                        "      width: 150px;\n" +
                        "     }"+
                        "  </style>"
                );
    };

    public  void doGet(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
        HttpSession httpSession = req.getSession();
        Database database = Database.getDbInstance();
        FixtureBeanI fixtureBean = new FixtureBean();

        Cookie userCookie = CookieUtils.getCookieByName(req, "username");
        String accessCookie = null;
        String firstLetter = null;

        if (userCookie != null) {
            accessCookie = userCookie.getValue();
            firstLetter = accessCookie.substring(0, 1).toUpperCase();
        } else {
            System.out.println("Cookie not found");
        }

            PrintWriter print = res.getWriter();
            print.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">" +
                    displayNavAndFixtures() +
                    "<body>\n" +
                    "  <div class=\"navbarContainer\" >\n" +
                    "        <nav class=\"navClass\">\n" +
                    "            <div class=\"title\">\n" +
                    "                <a href=\"/\">Etciket</a>\n" +
                    "            </div>\n" +
                    "            <div class=\"links\" >\n" +
                    "               <a href=\"./home\">HOME</a>\n" +
                    "               <a href=\"./tickets\">TICKETS</a>\n" +
                    "               <a href=\"./fixtures\">FIXTURES</a>\n" +
                    "            </div>\n" +
                    " <div class=\"lastPart\">\n" +
                    "          <p class=\"profile\" >  " +
                    firstLetter +
                    "</p>\n" +
                    "          <a href=\"./logout\" class=\"contactButton\"> LOGOUT </a>\n" +
                    "        </div>" +
                    "        </nav>\n" +
                    "    </div>" +
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
                    //body
                    "</html>"
        );

    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Database database = Database.getDbInstance();

        Cookie userCookie = CookieUtils.getCookieByName(req, "username");
        String accessCookie = null;
        String firstLetter = null;

        if (userCookie != null) {
            accessCookie = userCookie.getValue();
            firstLetter = accessCookie.substring(0, 1).toUpperCase();
        } else {
            System.out.println("Cookie not found");
        }

        serializeForm(fixture, req.getParameterMap());
        database.getFixtures().add(fixture);


            ServletContext context = getServletContext();
            FixtureBeanI fixtureBean = new FixtureBean();
            PrintWriter print = res.getWriter();

            print.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">" +
                    displayNavAndFixtures() +
                    "<body>\n" +
                    "  <div class=\"navbarContainer\" >\n" +
                    "        <nav class=\"navClass\">\n" +
                    "            <div class=\"title\">\n" +
                    "                <a href=\"/\">Etciket</a>\n" +
                    "            </div>\n" +
                    "            <div class=\"links\" >\n" +
                    "               <a href=\"./home\">HOME</a>\n" +
                    "               <a href=\"./tickets\">TICKETS</a>\n" +
                    "               <a href=\"./fixtures\">FIXTURES</a>\n" +
                    "            </div>\n" +
                    " <div class=\"lastPart\">\n" +
                    "          <p class=\"profile\" >  " +
                    firstLetter +
                    "</p>\n" +
                    "          <a href=\"./logout\" class=\"contactButton\"> LOGOUT </a>\n" +
                    "        </div>" +
                    "        </nav>\n" +
                    "    </div>" +
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
                            //body
                            "</html>"
            );

    }
}