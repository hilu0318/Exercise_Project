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
				
					<form id="file01_form" action="/step07/save/o" method="post" class="" enctype="multipart/form-data">
						<fieldset form="file01_form">
							<legend>로걸디스크에 이미지 저장 및 불러오기.</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file01">File</label>
								<input type="file"  id="file" name="file">
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					<hr>
					<form id="file01_form" action="/step07/save/i" method="post" class="" enctype="multipart/form-data">
						<fieldset form="file01_form">
							<legend>프로젝트 내 Resources폴더 내부에 <br>이미지 저장 및 불러오기.</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file01">File</label>
								<input type="file"  id="file" name="file">
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/views/import/js.jspf" %>
	
</body>
</html>
