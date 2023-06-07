package com.orgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveinformationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("userId");
        String pw = req.getParameter("password");

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);


        // db 조회
        // 추가적인 로직...
        req.setAttribute("userId",id);

        RequestDispatcher rd = req.getRequestDispatcher("print");
        rd.forward(req,resp);
    }
}
