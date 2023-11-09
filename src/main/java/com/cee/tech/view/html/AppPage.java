package com.cee.tech.view.html;
import com.cee.tech.view.css.AppCss;
import com.cee.tech.view.toolbar.Footer;
import com.cee.tech.view.toolbar.Navbar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class AppPage implements Serializable {

    public void renderHtml(HttpServletRequest req, HttpServletResponse res, String firstLetter, String content) throws IOException {

        PrintWriter print = res.getWriter();

        print.write("<!DOCTYPE html>\n" +
                "<html>\n" +

                "<head>" +
                new AppCss().getStyle() +
                "</head>" +
                "<body>" +

                new Navbar().menu(firstLetter));
                print.write(content);
            print.write(new Footer().footerMenu());

        print.write("</body>" +
                "</html>");

    }


}
