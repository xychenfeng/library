package com.book.mapper;

import java.util.List;

import com.book.pojo.User;

public interface UserMapper {
	
public User userLogin(User user);
    
    String insertUser(User user);

	/*
	    * ����
	    */
	   void save(User user);  
	   /*
	    * �޸�
	    */
	   boolean update(User user);  
	   /*
	    * ɾ��
	    */
	   boolean delete(int userId);  
	
	   /*
	    * ��ѯ����
	    */
	   public List<User> findAllUser();
	public void addUser(User user);
}
