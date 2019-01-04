<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>编辑用户</title>  
      
    <script type="text/javascript">  
    function updateUser(){  
        var form = document.forms[0];  
        form.action = "<%=basePath%>user/updateUser";  
        form.method="post";  
        form.submit();  
    }  
</script>  
  
  </head>  
    
  <body>  
    <h1>修改用户</h1>  
   <%--  <form action="">  
       
        姓名：<input type="text" name="name" value="${user.name }"/>  
        密码：<input type="text" name="age" value="${user.pwd }"/> 
        是否管理员：<input type="text" name="isad" value="${user.isad }"/>  
        <input type="button" value="编辑" onclick="updateUser()"/>  
    </form>  --%> 
     <form action="${pageContext.request.contextPath }/user/updateUser"> 
     ID： <input type="hidden" name="id" value="${user.userId }"/>   
        姓名：<input type="text" name="name" value="${user.userName }">  
      密码  ：<input type="text" name="pwd" value="${user.userPwd }">  
      是否管理员  ：<input type="text" name="isad" value="${user.isad }">  
        <input type="submit" value="编辑">  
    </form>  
  </body>  
    
</html>  