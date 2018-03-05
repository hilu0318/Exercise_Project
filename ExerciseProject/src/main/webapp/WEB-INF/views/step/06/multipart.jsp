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
					<form id="basic01_form" action="/step06/basic01" method="post" class="">
						<fieldset form="basic01_form">
							<legend>Basic-01 Form</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="message">Message</label>
								<input type="text" class="form-control" id="message01" name="message01" placeholder="Message">
							</div>
							<div class="form-group col-xs-8 col-sm-8 col-md-9">
								<div>
									결과 : ${ basic }
								</div>
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					
					<form id="basic02_form" action="/step06/basic02" method="post" class="">
						<fieldset form="basic02_form">
							<legend>Basic-02 Form</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="message01">Message01</label>
								<input type="text" class="form-control" id="message01" name="message01" placeholder="Message">
							</div>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="message02">Message02</label>
								<input type="text" class="form-control" id="message02" name="message02" placeholder="Message">
							</div>
							<div class="form-group col-xs-8 col-sm-8 col-md-9">
								<div>
									결과 : ${ basic02 }
								</div>
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					
					<form id="file01_form" action="/step06/file01" method="post" class="" enctype="multipart/form-data">
						<fieldset form="file01_form">
							<legend>File-01 Form : 단일 파일 전송</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file01">File</label>
								<input type="file"  id="file01" name="file01">
							</div>
							<div class="form-group col-xs-8 col-sm-8 col-md-9">
								<div>
									결과 : ${ file01 }
								</div>
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					
					<form id="file02_form" action="/step06/file02" method="post" class="" enctype="multipart/form-data">
						<fieldset form="file01_form">
							<legend>File-02 Form : 복수 파일 전송</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file01">File</label>
								<input type="file"  id="file02" name="file02">
							</div>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">
								<input type="file"  id="file02" name="file02">
							</div>
							<div class="form-group col-xs-8 col-sm-8 col-md-9">
								<div>
									결과 : ${ file02 }
								</div>
							</div>
							<div class="form-group col-xs-4 col-sm-4 col-md-3">
								<button type="submit" class="btn btn-primary btn-block">전송</button>
							</div>
						</fieldset>
					</form>
					
					<form id="file03_form" action="/step06/file03" method="post" class="" enctype="multipart/form-data">
						<fieldset form="file01_form">
							<legend>File-02 Form : 파일 및 일반 값 전송</legend>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="file03">File</label>
								<input type="file"  id="file03" name="file03">
							</div>
							<div class="form-group col-xs-12 col-sm-12 col-md-12">							
								<label for="message03">Message01</label>
								<input type="text" class="form-control" id="message03" name="message03" placeholder="Message">
							</div>
							<div class="form-group col-xs-8 col-sm-8 col-md-9">
								<div>
									결과 : ${ file02 }
								</div>
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
