<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reqeust Parameter</title>
</head>
<body>
    <h1>Reqeust Parameter</h1>
    <h3>GET 방식의 요청</h3>
    <h4>form 태그를 이용한 get 방식 요청</h4>
    <form action="querystring" method="GET">
        <label>이름 : </label>
        <input type="text" name="name">
        <br>
        <label>나이 : </label>
        <input type="number" name="age">
        <br>
        <label>생일 : </label>
        <input type="date" name="birthday">
        <br>
        <label>성별 : </label>
        <input type="radio" name="gender" id="male" value="M">
        <label for="male">남자</label>
        <input type="radio" name="gender" id="female" value="F">
        <label for="female">여자</label>
        <br>
        <input type="submit" value="GET 요청">
        

    </form>
</body>
</html>