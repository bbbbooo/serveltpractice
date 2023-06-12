package com.ohgiraffers.section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

//        req.setAttribute("lastName",lastName);
//        req.setAttribute("firstName",firstName);
        /* 필기
        * 쿠키 사용법
        * 1. 쿠키를 생성한다.
        * 2. 생성한 쿠키의 만료 시간을 설정한다.
        * 3. 응답 헤더에 쿠키를 담는다.
        * 4. 응답을 보낸다.
        *
        * 주의사항.
        * 1. 쿠키의 이름은 아스키 문자만을 사용해야 함
        * 2. 쿠키의 이름은 공백이나 일부 특수 문자 허용하지 않음
        * 3. 쿠키의 이름은 설정 이후 변경할 수 없다.
        * */

        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastrNameCookie = new Cookie("lastName", lastName);

        firstNameCookie.setMaxAge(60*60*24);
        lastrNameCookie.setMaxAge(60*60*24);

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastrNameCookie);

        resp.sendRedirect("/redirect");
    }
}
