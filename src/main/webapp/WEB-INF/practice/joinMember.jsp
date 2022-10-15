<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <h1>mvc버전 회원가입 양식</h1>

    <form action="/member/join" method="post">
        <lavel>#계정명:<input type="text" name="id"></lavel>
        <lavel>#비밀번호:<input type="password" name="pw"></lavel>
        <lavel>#이름:<input type="text" name="name"></lavel>
        <button type="submit">확인</button>
    </form>
    
</body>
</html>