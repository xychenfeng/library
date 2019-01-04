<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
<script type="text/javascript" src="js/jquery-2.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
 
       
   
    <script type="text/javascript">
    // 控制onsubmit提交的方法，方法名是vform()
        function form(){
            
            var userName = $("#userName").val();
            var userPwd = $("#userPwd").val();
            //判断上面的变量，如果为空字符串不能提交
            if(userName == ""){
                alert("请输入登录名！");
                return false;
            }
            if(userPwd == ""){
                alert("请输入密码！");
                return false;
            }
            //除以上结果的可以提交，返回true
            return true;
        }
    </script>

    <body>
<a href="${pageContext.request.contextPath}/file/goUpload">测试</a>
<form class="form-horizontal" action="${pageContext.request.contextPath}/user/login" method="post"
        onsubmit="return form()">
       
													<div class="row form-group">
														<div class="col-md-12">
															<label for="userName">用户名</label>
														</div>
														<div class="col-md-12">
															<span class="glyphicon glyphicon-user form-control-feedback small-graph"></span>
															<input type="text" name="userName" id="userName" class="form-control" placeholder="输入用户名">
														</div>
													</div>
													<div class="row form-group">
														<div class="col-md-12">
															<label for="userPwd">密码</label>
														</div>
														<div class="col-md-12">
															<span class="glyphicon glyphicon-lock form-control-feedback small-graph"></span>
															<input type="userPwd" name="userPwd" id="userPwd" class="form-control"
															placeholder="输入密码">
														</div>
													</div>
													</div>  
													<div class="row form-group button-group">
														<div class="col-md-6">
															<!--<input type="submit" class="btn btn-primary btn-block" value="注册">-->
															<a type="button" class="btn btn-primary btn-block" href="register.jsp">注册</a>
														</div>
														<div class="col-md-6">
															<input type="submit" class="btn btn-primary btn-block" value="登录" id="enter">
														</div>
													</div>
												</form>	
</body>
</html>