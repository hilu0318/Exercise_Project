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
				
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4>RestController 사용 <br>- Return type : String</h4>
						</div>
  						<div class="panel-body">
  							<div class="col-xs-12 col-sm-12 col-md-12">
  								<div class="col-xs-8 col-sm-8 col-md-8">
									<button type="button" class="btn btn-primary btn-block" id="btn_01">Ajax 전송 </button>
								</div>
								<div class="col-xs-4 col-sm-4 col-md-4">
									<h5>결과 : 
										<span id="result_01">
							
										</span>
									</h5>
								</div>
  							</div>
  						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4>RestController 사용 <br>- Return type : ResponseEntity</h4>
						</div>
  						<div class="panel-body">
  							<div class="col-xs-12 col-sm-12 col-md-12">
  								<div class="col-xs-8 col-sm-8 col-md-8">
									<button type="button" class="btn btn-primary btn-block" id="btn_02">Ajax 전송 </button>
								</div>
								<div class="col-xs-4 col-sm-4 col-md-4">
									<h5>결과 : 
										<span id="result_02">
							
										</span>
									</h5>
								</div>
  							</div>
  						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4>RestController 사용 <br>- Data 전송 <br>- Return type : String</h4>
						</div>
  						<div class="panel-body">
  							<div class="col-xs-12 col-sm-12 col-md-12">
  								<div class="col-xs-12 col-sm-12 col-md-12">
  									<input type="text" id="text_01" class="form-control" placeholder="TEXT">
  								</div>
  								<div class="col-xs-8 col-sm-8 col-md-8">
									<button type="button" class="btn btn-primary btn-block" id="btn_03">Ajax 전송 </button>
								</div>
								<div class="col-xs-4 col-sm-4 col-md-4">
									<h5>결과 : 
										<span id="result_03">
							
										</span>
									</h5>
								</div>
  							</div>
  						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4>RestController 사용 <br>- Data 전송 <br>- Return type : ResponseEntity</h4>
						</div>
  						<div class="panel-body">
    						<div class="col-xs-12 col-sm-12 col-md-12">
    							<div class="col-xs-12 col-sm-12 col-md-12">
  									<input type="text" id="text_02" class="form-control" placeholder="TEXT">
  								</div>
  								<div class="col-xs-8 col-sm-8 col-md-8">
									<button type="button" class="btn btn-primary btn-block" id="btn_04">Ajax 전송 </button>
								</div>
								<div class="col-xs-4 col-sm-4 col-md-4">
									<h5>결과 : 
										<span id="result_04">
								
										</span>
									</h5>
								</div>
	  						</div>
  						</div>
					</div>
					
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/import/js.jspf" %>
	<script src="/resources/js/step/step09.js"></script>
</body>
</html>
