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
				
					<form id="resize_form" action="/step08/resize" method="post"  class="form-horizontal" enctype="multipart/form-data">
						<fieldset form="resize_form">
							<legend>이미지 리사이징</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">
								<label class="control-label col-xs-5 col-sm-5 col-md-5">사이즈 선택</label>
								<div class="col-xs-7 col-sm-7 col-md-7" >
									<select name="size" id="size" class="form-control">
										<option value="20">20%</option>
										<option value="40">40%</option>
										<option value="60">60%</option>
										<option value="80">80%</option>
									</select>
								</div>
							</div>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file">File</label>
								<input type="file"  id="file" name="file">
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					
					<form id="crop_form" action="/step08/crop" method="post"  class="form-horizontal" enctype="multipart/form-data">
						<fieldset form="crop_form">
							<legend>이미지 크롭</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file">File</label>
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
