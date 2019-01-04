package com.book.pojo;

public class User {

	private int UserId;// 用户ID

	private String userName;// 用户姓名

	private String userPwd;// 密码

	private boolean isad;// 是否管理员

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public boolean isIsad() {
		return isad;
	}

	public void setIsad(boolean isad) {
		this.isad = isad;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", userName=" + userName + ", userPwd=" + userPwd + ", isad=" + isad + "]";
	}

	

}