package com.book.controller;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.book.pojo.UserInfo;
import com.book.service.impl.UserInfoServiceImpl;

@Controller
@RequestMapping("/file")
public class UploadController {
	
	
	@Resource
	private UserInfoServiceImpl userInfoServiceImpl;
	
	
	@RequestMapping("goUpload")
	public String upload() {
		return "upload";
		
	}
	
	@RequestMapping("/upload")  
    public String upload(UserInfo userInfo,HttpServletRequest request,Model model) throws Exception{  
    System.out.println(request.getParameter("userName"));  
      //保存数据库的路径  
      String sqlPath = null;   
      //定义文件保存的本地路径  
     String localPath=request.getServletContext().getRealPath("/");
     
      System.out.println(localPath);
    
      //定义 文件名  
      String filename=null;    
      if(!userInfo.getFile().isEmpty()){    
          //生成uuid作为文件名称    
          String uuid = UUID.randomUUID().toString().replaceAll("-","");    
          //获得文件类型（可以判断如果不是图片，禁止上传）    
          String contentType=userInfo.getFile().getContentType();    
          //获得文件后缀名   
          String suffixName=contentType.substring(contentType.indexOf("/")+1);  
          //得到 文件名  
          filename=uuid+"."+suffixName;   
          System.out.println(filename);  
          //文件保存路径  
          userInfo.getFile().transferTo(new File(localPath+"upload/"+filename));    
      }  
      //把图片的相对路径保存至数据库  
      
      sqlPath = "/upload/"+filename;  

      System.out.println(sqlPath);  
      userInfo.setUserImage(sqlPath);  
      userInfoServiceImpl.addUserInfo(userInfo); 
      model.addAttribute("userInfo", userInfo);  
      return "redirect:/file/goUpload";  
    }  

	
}
