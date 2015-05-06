<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">회원가입</h3>
<form action="addhUser" method="post">
	<table align="center">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="number" name="age"></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><input type="radio" name="gender" value="0">남자
				<input type="radio" name="gender" value="1">여자
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="회원가입">
				<input type="reset" value="취소">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<a href="index.html">index Page로 가기</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>