<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 화면</title>
</head>
<body>
	<!-- form에서 action이 생략되면 현재 URL로 전송 -->
	<form method="post">
	제목:<input type="text" name="subject" /><br />
	내용:<textarea rows="5" cols="20" name="content"></textarea><br />
	<input type="submit" value="전송" />
	</form>
</body>
</html>




