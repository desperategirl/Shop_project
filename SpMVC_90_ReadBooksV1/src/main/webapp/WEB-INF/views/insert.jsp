<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
	<title>insert</title>
</head>
<body>

<form method="POST">
	<input name="b_code" value="${bookVO.b_code}" placeholder="도서코드">
	<input name="b_name" placeholder="도서명"value="${bookVO.b_name}">
	<input name="b_auther" placeholder="저자"value="${bookVO.b_auther}">
	<input name="b_comp" placeholder="출판사"value="${bookVO.b_comp}">
	<input name="b_year" placeholder="출판년도"value="${bookVO.b_year}">
	<input name="b_iprice" placeholder="구입가격"value="${bookVO.b_iprice}">
	<button>저장</button>	
</form>

</body>
</html>
