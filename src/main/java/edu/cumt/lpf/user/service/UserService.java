package edu.cumt.lpf.user.service;

import edu.cumt.lpf.user.pojo.User;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe UserService 接口类
 * @time 2018年4月18日下午5:18:45
 */
public interface UserService {
	
	/**
	 * @method 根据user_name查询 User
	 * @author 林鹏飞
	 * @param user_name
	 * @return User
	 */
	public User  findUserByName(String user_name);
}
