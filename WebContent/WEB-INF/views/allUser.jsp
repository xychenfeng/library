<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html>

<html>  
  <head>  
    <base href="<%=basePath%>">  
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.2.1.min.js"></script>  
    <title>用户列表</title>  
      
    <script type="text/javascript">  
    function del(id){  
        $.get("<%=basePath%>user/delUser?id=" + id,function(data){  
            if("success" == data.result){  
                alert("删除成功");  
                window.location.reload();  
            }else{  
                alert("删除失败");  
            }  
        });  
    }  
</script>
</head>
<body>
<h6><a href="<%=basePath%>user/toAddUser">添加用户</a></h6>  
<table border="1">  
        <tbody>  
            <tr>  
                <th>ID</th>  
                <th>姓名</th>  
                  <th>密码</th> 
                  <th>头像</th>
                    <th>是否管理员</th> 
                <th>操作</th>  
            </tr>  
            <c:if test="${!empty userList }">  
                <c:forEach items="${userList}" var="user">  
                    <tr>  
                    <td>${user.userId }</td>
                        <td>${user.userName }</td>  
                        <td>${user.userPwd }</td>
                        <td><img src="upload/${basePath}"></td>  
                        <td>${user.isad }</td>
                        
                        <td>  
                            <a href="<%=basePath%>user/getUser?userId=${user.userId}">编辑</a>  
                            <a href="javascript:del('${user.userId }')">删除</a> 
                            <%--  
                             <a href="<%=basePath%>user/delUser?id=${user.id}">删除</a> --%>
                        </td>  
                    </tr>               
                </c:forEach>  
            </c:if>  
        </tbody>  
    </table>  
</html>