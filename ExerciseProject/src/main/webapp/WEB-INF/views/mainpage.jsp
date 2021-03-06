<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/taglib/taglib.jspf" %>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	
	<%@ include file="/WEB-INF/views/import/css.jspf" %>
	
</head>
<body>
	<%@ include file="/WEB-INF/views/topmenu/topmenu.jspf" %>
	<div class="top">
		<div class="container">
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6 col-xs-offset-3 col-sm-offset-3 col-md-offset-3">
					<div class="list-group">
						<a href="#" class="list-group-item">환경설정 - 1</a>
						<a href="#" class="list-group-item">초기설정 - 1</a>
						<a href="/step01/dboneprint" class="list-group-item">step 1. 단일 DB 값 페이지에 출력</a>
						<a href="/step02/dblistprint" class="list-group-item">step 2. 여려 DB 값 페이지에 출력</a>
						<a href="/step03/dbinsert" class="list-group-item">step 3. DB 에 문자 입력 후 목록 출력</a>
						<a href="/step04/pagination" class="list-group-item">step 4. Pagination</a>
						<a href="/step05/listcount" class="list-group-item">step 5. 게시물 목록 개수 변경</a>
						<a href="/step06/multipart" class="list-group-item">step 6. 폼 전송 및 파일 전송</a>
						<a href="/step07/save" class="list-group-item">step 7. 이미지 저장 및 출력</a>
						<a href="/step08/main" class="list-group-item">step 8. 이미지 리사이징 및 크롭</a>
						<a href="/step09/main" class="list-group-item">step 9. Ajax 전송 01 - RestController 사용</a>
						<a href="#" class="list-group-item">step 10. Ajax 전송 02 - Controller 사용</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/import/js.jspf" %>
	
</body>
</html>
