<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>显示图片</h3>  
<img  src="/upload/6a786a09b3de9c825399abb16081800a19d84335.jpg">  <hr>  
  <form action="${pageContext.request.contextPath }/file/upload" method="post" enctype="multipart/form-data">  
 <label>用户名：</label><input type="text" name="userName"><br>  
 <label>上传头像：</label><input type="file" name="file"><br>  
 <input type="submit">  
 </form>  
</body>
</html>