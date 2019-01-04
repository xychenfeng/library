package com.book.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.mapper.UserMapper;
import com.book.pojo.User;
import com.book.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userDao;
	
	
	
	@Override
	public void addUser(User user) {
userDao.addUser(user);
System.out.println("service��ʵ����");		
	}

	/**  
     * ��ѯUser��ȫ������  
     */  
	public List<User> findAllUser() {
		return userDao.findAllUser();
		
	}
	
	 /**  
     * ����  id  ɾ�� ����  
     */  
    public boolean delete(int userId) {  
        return userDao.delete(userId);  
    }  
    /**  
     * ��������  
     */  
    public void save(User user) {  
    	userDao.save(user);  
    }  
    /**  
     * ���� id �޸Ķ�Ӧ����  
     */  
    public boolean update(User user) {  
        return userDao.update(user);  
    }

	@Override
	public User userLogin(User user) {
	
		return	userDao.userLogin(user);
	}

	@Override
	public String insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	
}
