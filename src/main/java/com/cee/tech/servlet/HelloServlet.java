package com.cee.tech.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet("/musili")
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Hello servlet created");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter print = servletResponse.getWriter();
        print.println("<b> Calculator</b> </br>");
        String numberStr = servletRequest.getParameter("number1");
        String number2Str = servletRequest.getParameter("number2");

        BigDecimal number1 = new BigDecimal(numberStr);
        BigDecimal number2 = new BigDecimal(number2Str);
         print.println(numberStr + " + " + number2Str + " = " + number2.add(number1) );
          
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
