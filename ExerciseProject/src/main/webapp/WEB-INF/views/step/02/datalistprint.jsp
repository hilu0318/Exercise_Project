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
					<ul class="list-group">
						<!-- JSTL의 forEach문을 사용해서 반복문 수행 -->
						<c:forEach var="list" items="${ list }">
							<li class="list-group-item">${ list }</li>
						</c:forEach>
						
					</ul>
				</div>
				<div class="col-xs-6 col-sm-6 col-md-6 col-xs-offset-3 col-sm-offset-3 col-md-offset-3">
					<div class="col-xs-2 col-sm-2 col-md-2 col-xs-offset-10 col-sm-offset-10 col-md-offset-10">
						<a class="btn btn-primary btn-block" href="/">Main</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/import/js.jspf" %>
</body>
</html>