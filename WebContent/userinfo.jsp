<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="tab-content-inner active">
		<h3 class="cursive-font text-center">详细信息(选填)</h3>
		<form action="userinfo_createUserInfo" class="form-horizontal"
			id="info-form">
			<div class="row form-group ">
				<div class="col-md-12">
					<label for="sex" class="control-label col-md-4">性&ensp;别</label>
					<div class="col-md-8">
						<label class="radio-inline"> <input type="radio"
							name="sex" id="male" value="male"> 男
						</label> <label class="radio-inline"> <input type="radio"
							name="sex" id="female" value="female"> 女
						</label>
					</div>
				</div>
			</div>
			<div class="row form-group " id="datetimepicker">
				<label for="birthday" class="control-label col-md-4">生&ensp;日</label>
				<div class="col-md-8">
					<input type="text" class="form-control form_date" id="date"
						name="date">
				</div>
			</div>
			<div class="row form-group">
				<label for="job" class="control-label col-md-4">职&ensp;位</label>
				<div class="col-md-8">
					<input type="text" class="form-control" placeholder="职位" id="job"
						name="job">
				</div>
			</div>
			<div class="row form-group">
				<label for="place" class="control-label col-md-4">所&emsp;在&emsp;地</label>
				<div class="col-md-8" data-toggle="distpicker">
					<select class="select" name="province"></select>
					<!-- 省 -->
					  <select class="select" name="city"></select>
					<!-- 市 -->
					  <select class="select" name="area"></select>
					<!-- 区 -->
				</div>
			</div>
			<div class="row form-group">
				<label for="post" class="control-label col-md-4">邮&emsp;箱</label>
				<div class="col-md-8">
					<input type="text" class="form-control" placeholder="邮箱"
						name="post">
				</div>
			</div>
			<div class="row form-group button-group">
				<div class="col-md-6 col-md-push-3">
					<input type="submit" class="btn btn-primary btn-block" value="进入系统"
						id="enter">
				</div>
			</div>
		</form>
	</div>
</body>
</html>