package com.cee.tech.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cee.tech.app.Fixture;

@WebServlet("/home")
public class Home extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("./app/home.html");
        // res.sendRedirect("./app/home.html")
        dispatcher.forward(req, res);

    }

    public String upcomingFixtures() {
        List<Fixture> fixtures = new ArrayList<>();
        fixtures.add(new Fixture("001", "21:00 EAT", "22/10/2023", "Tusker fc", "Ulinzi Stars"));
        fixtures.add(new Fixture("002", "17:00 EAT", "27/10/2023", "Gor Mahia", "Shabana"));
        fixtures.add(new Fixture("003", "14:00 EAT", "1/11/2023", "Kariobangi Sharks", "Kakamega Homeboyz"));
        fixtures.add(new Fixture("004", "15:00 EAT", "3/11/2023", "AFC Leopards", "Muhoroni Youth"));
        fixtures.add(new Fixture("005", "16:00 EAT", "5/11/2023", "Muranga Seals", "Bidco United"));


        StringBuilder tbBuilder = new StringBuilder();

        tbBuilder.append("<table><tr><th>Fixture ID</th> <th>Home Team</th> <th>Away Team</> <th>Fixture Time</th> <th>Fixture Date</th></tr>");

        for(Fixture fixture: fixtures)
        tbBuilder.append(fixture.tableRow());

        tbBuilder.append("</table>");
        
        return tbBuilder.toString();
    }
}
