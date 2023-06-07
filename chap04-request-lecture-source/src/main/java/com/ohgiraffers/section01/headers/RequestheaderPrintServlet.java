package com.ohgiraffers.section01.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")
public class RequestheaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //헤더의 키값을 문자열로 가져옴
        Enumeration<String> headerNames = req.getHeaderNames();

        while(headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }

        //accept 헤더 값을 가져옴
        System.out.println("accept : " + req.getHeader("accept"));
        System.out.println("cookie : " + req.getHeader("cookie"));
    }


}
