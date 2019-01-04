<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
	

<script type="text/javascript" src="js/jquery-2.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="tab">
		<h3 class="cursive-font text-center">用户注册</h3>
		<form action="register" class="form-horizontal"
			id="register-form" method="post">
			<div class="form-group">
				<label for="userName" class="control-label col-md-4">账&ensp;号</label>
				<div class="col-md-8 ">
					<input type="text" class="form-control" placeholder="账号"
						name="userName" id="userName">
				</div>
			</div>
			<div class="row form-group">
				<label for="userPwd" class="control-label col-md-4">密&ensp;码</label>
				<div class="col-md-8">
					<input type="text" class="form-control" placeholder="请输入密码"
						name="userPwd">
				</div>
			</div>
			<div class="row form-group">
				<label for="userPwd" class="control-label col-md-4">确认密码</label>
				<div class="col-md-8">
					<input type="text" class="form-control" placeholder="请再次输入密码"
						name="confirmPassword">
				</div>
			</div>
			<div class="row form-group">
				<label for="username" class="control-label col-md-4">昵&ensp;称</label>
				<div class="col-md-8">
					<input type="text" class="form-control" placeholder="请输入昵称"
						name="username">
				</div>
			</div>
			<div class="row form-group button-group">
				<div class="col-md-6">
					<a type="button" class="btn btn-primary btn-block" href="index.jsp">返回</a>
				</div>
				<div class="col-md-6">
					<input type="submit" class="btn btn-primary btn-block" value="下一步"
						id="next">
				</div>
			</div>
		</form>
		</div>
</body>
</html>