package edu.cumt.lpf.user.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.cumt.lpf.user.mapper.UserMapper;
import edu.cumt.lpf.user.pojo.User;
import edu.cumt.lpf.user.pojo.UserExample;
import edu.cumt.lpf.user.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByName(String user_name) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUserNameEqualTo(user_name);
		return userMapper.selectByExample(userExample).get(0);
		
	}

}
