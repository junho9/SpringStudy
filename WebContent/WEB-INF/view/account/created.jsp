<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>계정 생성</title>
</head>
<body>

계정 생성됨
<ul>
	<li>아이디 : ${command.id } </li>
	<li>이름 : ${command.name } </li>
	<li>우편번호 : ${command.address.address1 } </li>
	<li>주소 : ${command.address.address1 } </li>
</ul>

</body>
</html>