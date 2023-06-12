<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-06-12
  Time: 오후 4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%--%>
<%--  String menuName = (String) request.getAttribute("menuName");--%>
<%--  int amount = (int) request.getAttribute("amount");--%>
<%--  int orderPrice = (int) request.getAttribute("orderPrice");--%>
<%--%>--%>
<%--<h3>주문하신 음식 : <%= menuName%></h3>--%>
<%--<h3>주문하신 수량 : <%= amount%>인분</h3>--%>
<%--<h3>결제하실 금액 : <%= orderPrice%></h3>--%>
<h3>주문하신 음식 : ${requestScope.menuName}</h3>
<h3>주문하신 음식 : ${requestScope.amount}인분</h3>
<h3>주문하신 음식 : ${requestScope.orderPrice}</h3>

</body>
</html>
