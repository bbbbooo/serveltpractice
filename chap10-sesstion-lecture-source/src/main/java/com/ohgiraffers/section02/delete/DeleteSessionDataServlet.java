package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Enumeration<String> sessionNames = session.getAttributeNames();
        while(sessionNames.hasMoreElements()){
            System.out.println("sessionNames = " + sessionNames.nextElement());
        }

        /* 필기
         * 세션의 데이터를 지우는 방법
         * 1. 세션에 만료 시간 설정
         * 2. removeAttribute() 로 session의 attribute를 제거한다.
         * 3. invalidate() 를 호출하면 세션이 만료된다. -> 로그아웃
         * */

//        session.setMaxInactiveInterval(600);
        session.removeAttribute("firstName");
        Enumeration<String> reamin = session.getAttributeNames();
        while(reamin.hasMoreElements()){
            System.out.println("reamin.nextElement() = " + reamin.nextElement());
        }
        
        session.invalidate();
        Enumeration<String> reamin2 = session.getAttributeNames();
        while (reamin2.hasMoreElements()){
            System.out.println("reamin2.nextElement() = " + reamin2.nextElement());
        }
        
    }
}
