<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>사진 전송 페이지</h1>
<hr/>   
<form method="post" action="/image" enctype="multipart/form-data">
    <input type="file" name="pic" />
    <button>사진전송</button>
</form>
</body>
</html>