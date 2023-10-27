<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>boardList 게시물 목록</title>
	</head>
	<body>
		<h2>게시글 목록</h2>
		<table>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
				<th>비고</th>
			</tr>
			
			<c:forEach var="good" items="${boardList.num }" varStatus="num">
				<tr>
					<td>${num.index+1 }</td>
					<td>${good.name }</td>
					<td>${good.title }</td>
					<td>${good.content }</td>
					<td><input type="button" value="삭제" onclick="location.href='boardDelete?num=${good.num}'"></td>
				</tr>
			</c:forEach>	
		</table>
		
		<!-- 게시글 작성페이지로 이동 -->
		<a href="boardRegister">게시글 작성</a>
	</body>
</html>