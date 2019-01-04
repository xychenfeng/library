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
      
    <title>添加用户</title>  
      
   <%--  <script type="text/javascript">  
    function addUser(){  
        var form = document.forms[0];  
        form.action = "<%=basePath%>user/addUser";  
        form.method="post";  
        form.submit();  
    }  
</script>  --%> 
  
  </head>  
    
  <body>  
    <h1>添加用户</h1>  
    <form action="${pageContext.request.contextPath }/user/addUser">  
        姓名：<input type="text" name="userName">  
      密码  ：<input type="text" name="userPwd">  
      是否管理员  ：<input type="text" name="isad">  
        <input type="submit" value="添加">  
    </form>  
  </body>  
</html>  