<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <h1>MVC버전 목록보기</h1>

    <c:forEach var="m" items="${memberList}">
        <li>
            # 아이디: ${m.stuNum}, 이름: <a href="#">${m.name}</a><a class="del-btn" href="#"> [delete]</a>
        </li>
    </c:forEach>

    <a href="/member/joinPage">새로운 회원가입 하기</a>

    
</body>
</html>