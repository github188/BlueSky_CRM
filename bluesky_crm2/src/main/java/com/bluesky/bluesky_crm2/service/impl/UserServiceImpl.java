package com.bluesky.bluesky_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluesky.bluesky_crm2.model.Users;
import com.bluesky.bluesky_crm2.service.UserService;
import com.bluesky.bluesky_crm2.mapper.UserMapper;

/**
 * �û�����ӿ�ʵ����
 * 
 * @author ������
 * @date 2016��7��2��
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	/**
	 * �����û����ݲ�
	 */
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public Users loging(String name, String pwd) {
		System.out.println("���� userMapper");
		return userMapper.loging(name, pwd);
	}

	@Override
	public void addUser(Users users) {
		userMapper.addUser(users);
	}

	@Override
	public void editUser(Users users) {
		userMapper.editUser(users);
	}

	@Override
	public void modifyPwd(Users users) {
		userMapper.modifyPwd(users);
	}

}
