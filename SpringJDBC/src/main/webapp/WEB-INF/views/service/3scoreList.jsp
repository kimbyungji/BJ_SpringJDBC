<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>점수 결과</title>
	</head>
	<body>
		<h2>점수 등록 결과</h2>
		<c:forEach var="good" items="${scoreList }" varStatus="num">
			<%-- 화면 출력 번호 : ${num.index} --%>
			번호 : ${num.index+1 }<br>
			이름 : ${good.name }<br>
			국어 : ${good.kor }<br>
			영어 : ${good.eng }<br>
			수학 : ${good.math }<br>
			<input type="button" value="삭제" onclick="location.href='scoreDelete?num=${good.num}'"><br>
		</c:forEach>
		
		<a href="1scoreRegister">점수 등록하러 가기</a>
	</body>
</html>