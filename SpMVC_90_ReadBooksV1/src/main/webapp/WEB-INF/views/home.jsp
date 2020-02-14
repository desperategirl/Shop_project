<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Home</title>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<script>
	$(function(){
		$(".btn-modify").click(function(){
			var b_code = $(this).attr("data-id")
			document.location.href = "${rootPath}/book/update?bcode=" + b_code
		})
		
		$(".btn-delete").click(function(){
			var b_code = $(this).attr("data-id")
			document.location.href = "${rootPath}/book/delete?b_code=" + b_code
		})
	})
</script>
<body>

	<table>
		<tr>
			<th>도서코드</th>
			<th>도서명</th>
			<th>저자</th>
			<th>출판사</th>
			<th>구입일자</th>
			<th>구입가격</th>
		</tr>

		<c:choose>
			<c:when test="${empty bookList}">
				<tr>
					<td colspan="6">도서정보가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="book" items="${bookList}">
					<tr>
						<td>${book.b_code}</td>
						<td>${book.b_name}</td>
						<td>${book.b_auther}</td>
						<td>${book.b_comp}</td>
						<td>${book.b_year}</td>
						<td>${book.b_iprice}</td>
					
					<td><button type="button" class="btn-modify" data-id="${book.b_code}">도서목록수정</button></td>
					<td><button type="button" class="btn-delete" data-id="${book.b_code}">도서목록삭제</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<a href="${rootPath}/book/insert"><button>도서목록등록</button></a>

</body>
</html>
