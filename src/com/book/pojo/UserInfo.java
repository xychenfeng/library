package com.book.pojo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class UserInfo {
	private int userId;
	private int userinfoId;
	private String userName;
	private String userSex;
	private Date userBirthday;
	private String userJob;
	private String userPost;
	private String userIntroduction;
	private int userPlace;
	private String userImage;
	private MultipartFile file;  
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserinfoId() {
		return userinfoId;
	}
	public void setUserinfoId(int userinfoId) {
		this.userinfoId = userinfoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserJob() {
		return userJob;
	}
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	public String getUserPost() {
		return userPost;
	}
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	public String getUserIntroduction() {
		return userIntroduction;
	}
	public void setUserIntroduction(String userIntroduction) {
		this.userIntroduction = userIntroduction;
	}
	public int getUserPlace() {
		return userPlace;
	}
	public void setUserPlace(int userPlace) {
		this.userPlace = userPlace;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userinfoId=" + userinfoId + ", userName=" + userName + ", userSex="
				+ userSex + ", userBirthday=" + userBirthday + ", userJob=" + userJob + ", userPost=" + userPost
				+ ", userIntroduction=" + userIntroduction + ", userPlace=" + userPlace + ", userImage=" + userImage
				+ "]";
	}
	
	
	

}
