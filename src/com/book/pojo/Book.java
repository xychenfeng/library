package com.book.pojo;

public class Book {
	private int bookId;//书籍ID
	private int userId;//用户ID
	private String bookName;//书名
	private String bookType;//书籍
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", userId=" + userId + ", bookName=" + bookName + ", bookType=" + bookType
				+ "]";
	}
	

}
