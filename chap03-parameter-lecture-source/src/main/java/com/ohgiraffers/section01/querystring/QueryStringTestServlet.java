package com.ohgiraffers.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // input name=key 값을 가져옴
        String name = request.getParameter("name");
        System.out.println("name = " + name);

        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("age = " + age);
//
////        Date date = (Date)request.getParameter("birthday");
//
//        //2023-06-07
//        String tempDate = request.getParameter("birthday");
//        String[] arr = tempDate.split("-");
//        int year = Integer.parseInt(arr[0]);
//        int month = Integer.parseInt(arr[1]);
//        int day = Integer.parseInt(arr[2]);
//
//        Calendar calendar = new GregorianCalendar(year, month-1, day);
//        Date birthday = new Date(calendar.getTimeInMillis());
//
//        System.out.println("birthday = " + birthday);

        java.sql.Date birthday= java.sql.Date.valueOf(request.getParameter("birthday"));
        System.out.println("birthday = " + birthday);
        System.out.println(birthday instanceof java.sql.Date);
    }
}