package com.book.pojo;

public class User {

	private int UserId;// �û�ID

	private String userName;// �û�����

	private String userPwd;// ����

	private boolean isad;// �Ƿ����Ա

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