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
					<div class="col-xs-10 col-sm-10 col-md-10">
						<form class="form-inline" action="/step03/register" method="get" >
							<div class="form-group">
    							<div class="col-xs-4 col-sm-4 col-md-4">
									<input type="text" class="form-control" id="data" name="data" placeholder="DATA">
								</div>
							</div>
							<div class="form-group">
								<div class="col-xs-2 col-sm-2 col-md-2">
									<button type="submit" class="btn btn-default">입력</button>
								</div>
							</div>
						</form>
					</div>
					<div class="col-xs-2 col-sm-2 col-md-2">
						<a class="btn btn-primary btn-block" href="/">Main</a>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6 col-xs-offset-3 col-sm-offset-3 col-md-offset-3">
					<table class="table table-bordered">
							<caption></caption>
							<thead>
								<tr>
									<th class="col-xs-3 col-sm-3 col-md-3 text-center"><h3>no.</h3></th>
									<th class="col-xs-9 col-sm-9 col-md-9 text-center"><h3>data</h3></th>
								</tr>
							</thead>
							<tbody>
								<!-- JSTL의 forEach문을 사용해서 반복문 수행 -->
								<c:forEach var="list" items="${ list }">
									<tr>
										<td>${ list.no }</td>
										<td>${ list.data }</td>
									</tr>
								</c:forEach> 								
							</tbody>
						</table>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/import/js.jspf" %>
</body>
</html>