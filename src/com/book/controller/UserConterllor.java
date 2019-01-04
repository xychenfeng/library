package com.book.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.pojo.User;
import com.book.service.impl.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserConterllor {

	@Resource
	private UserServiceImpl userServiceImpl;
	
	/*
	 * 登录
	 */
	 @RequestMapping("/login")
     public String elogin(HttpServletRequest request){
         String userName = request.getParameter("userName");
         String userPwd = request.getParameter("userPwd");
         System.out.println("name:"+userName);
         User user = new User();
        user.setUserName(userName);
        user.setUserPwd(userPwd);
         
         User user1 = userServiceImpl.userLogin(user);
             if(user1!=null){
                 return "redirect:/user/getAllUser";
             }else{
                 return "error";
             }
         }
	 @RequestMapping("/register")
	 public String register() {
		return "userinfo.jsp";
		 
	 }
	
	/*
	 * ��ȡ�����û��б�  
	 */
    @RequestMapping("getAllUser")  
	public String getAllUser(HttpServletRequest request){  
	    List<User> user = userServiceImpl.findAllUser();
	  
	    request.setAttribute("userList", user);  
	    return "allUser";  
	}  
	/* 
	 * ��ת������û�����  
	 
	 */  
	@RequestMapping("/toAddUser")  
	public String toAddUser(){  
	    return "/addUser";  
	}  
	/* 
	 * ����û����ض���  
	 
	 */  
	@RequestMapping("/addUser")  
	public String addUser(User user){  
		userServiceImpl.save(user);  
	    return "redirect:/user/getAllUser";  
	}  
	/* 
	 *�༭�û�   
	 */  
	@RequestMapping("/updateUser")  
	public String updateUser(User user,HttpServletRequest request) throws Exception{  
	    if(userServiceImpl.update(user)){  
	       
	        request.setAttribute("user", user);  
	       
	        return "redirect:/user/getAllUser";  
	    }else{  
	        return "/error";  
	    }  
	}  
	
	/*
	 * ɾ���û�   
	 */
	 
	@RequestMapping("/delUser")  
	public void delUser(int id,HttpServletRequest request,HttpServletResponse response){  
	    String result = "{\"result\":\"error\"}";  
	    if(userServiceImpl.delete(id)){  
	        result = "{\"result\":\"success\"}";  
	    }  
	    response.setContentType("application/json");  
	    try {  
	        PrintWriter out = response.getWriter();  
	        out.write(result);  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	}  
	/*
	@RequestMapping("/delUser") 
	public String delUser(int id,HttpServletRequest request,HttpServletResponse response){ 
	String result = "forward:/user/delFail"; //WEB-INF/jsp/delFail.jsp(�Լ������ģ�
	if(userService.delete(id)){ 
	result = "forward:/user/getAllUser" ;//��ת��allUser.jsp���൱��ɾ ��֮��ˢ��ҳ��
	} 
	return result;
	} */
	
}
