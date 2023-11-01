package com.cee.tech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/leftie")
public class HelloFinal extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter print = res.getWriter();
        print.println("<b> Calculator - Multiply</b> </br>");
        String numberStr = req.getParameter("number1");
        String number2Str = req.getParameter("number2");

        BigDecimal number1 = new BigDecimal(numberStr);
        BigDecimal number2 = new BigDecimal(number2Str);
        print.println(numberStr + " * " + number2Str + " = " + number2.multiply(number1));
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter print = res.getWriter();
        print.println("<b> Calculator - Multiply</b> </br>");
        String numberStr = req.getParameter("number1");
        String number2Str = req.getParameter("number2");

        BigDecimal number1 = new BigDecimal(numberStr);
        BigDecimal number2 = new BigDecimal(number2Str);
        print.println(numberStr + " * " + number2Str + " = " + number2.multiply(number1));
    }
}
