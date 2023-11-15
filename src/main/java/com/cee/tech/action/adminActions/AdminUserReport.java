package com.cee.tech.action.adminActions;

import com.cee.tech.action.BaseActionClass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/adminusers")
public class AdminUserReport extends BaseActionClass {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        renderAdminPage(req, res, "   <div class=\"adminTableContainer\">\n" +
                "      <p class=\"fixtureTitleTable\">Users Report</p>\n" +
                "\n" +
                "      <table>\n" +
                "        <tr>\n" +
                "          <th>Username</th>\n" +
                "          <th>VIP tickets</th>\n" +
                "          <th>Normal tickets</th>\n" +
                "          <th>Action</th>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>John Doe</td>\n" +
                "          <td>0</td>\n" +
                "          <td>1</td>\n" +
                "          <td>\n" +
                "            <div class=\"userOutlineButton\">Details</div>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Mahrez</td>\n" +
                "          <td>1</td>\n" +
                "          <td>1</td>\n" +
                "          <td>\n" +
                "            <div class=\"userOutlineButton\">Details</div>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Musili</td>\n" +
                "          <td>2</td>\n" +
                "          <td>0</td>\n" +
                "          <td>\n" +
                "            <div class=\"userOutlineButton\">Details</div>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </table>\n" +
                "      <div class=\"ticketReportButton\">\n" +
                "        <a href=\"#\" class=\"ticketReportOneButton\">Download</a>\n" +
                "      </div>\n" +
                "    </div>");
    }
}
