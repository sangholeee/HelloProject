<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.js"></script>
<script>
	$(document).ready(function(){
		$('#btnKor, #btnEng, #btnJpn').on('click', function(){
			alert($(this).text());
		})
	})
</script>
</head>
<body>

	<button id="btnKor">안녕하세요</button><br>
	<button id="btnEng">Hello</button><br>
	<button id="btnJpn">おはようございます</button><br>

</body>
</html>