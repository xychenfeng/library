package com.book.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.mapper.UserInfoMapper;
import com.book.pojo.UserInfo;
import com.book.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	private UserInfoMapper userInfoDao;

	@Override
	public void  addUserInfo(UserInfo userInfo) {
		
			userInfoDao.addUserInfo(userInfo);
		
	}

}
