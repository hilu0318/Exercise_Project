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
				<div class="col-xs-8 col-sm-8 col-md-8 col-xs-offset-2 col-sm-offset-2 col-md-offset-2">
					<div class="col-xs-4 col-sm-3 col-md-2 col-xs-offset-8 col-sm-offset-9 col-md-offset-10">
						<a class="btn btn-primary btn-block" href="/">Main</a>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-8 col-sm-8 col-md-8 col-xs-offset-2 col-sm-offset-2 col-md-offset-2">
					<table class="table table-bordered">
						<caption></caption>
						<thead>
							<tr>
								<th class="col-xs-3 col-sm-3 col-md-3 text-center"><h5>no.</h5></th>
								<th class="col-xs-9 col-sm-9 col-md-9 text-center"><h5>data</h5></th>
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
						<tfoot>
							<tr>
								<td colspan="2" class="text-center">
									<ul class="pagination">
										<c:if test="${ pg.prevGroup }">
										<li>
			      							<a href="/step04/pagination?currentPage=${ pg.prevPage }" aria-label="Previous">
			        							<span aria-hidden="true">&laquo;</span>
											</a>
										</li>
										</c:if>
										<c:forEach var="num" begin="${ pg.beginPage }" end="${ pg.endPage }">
										<li class="<c:if test="${ pg.currentPage == num }">active</c:if>">
											<a href="/step04/pagination?currentPage=${ num }">${ num }</a>
										</li>
										</c:forEach>
										<c:if test="${ pg.nextGroup }">
										<li>
											<a href="/step04/pagination?currentPage=${ pg.nextPage }" aria-label="Next">
												<span aria-hidden="true">&raquo;</span>
											</a>
										</li>
										</c:if>										
									</ul>
								</td>
							</tr>
						</tfoot>
					</table>					
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/import/js.jspf" %>
</body>
</html>