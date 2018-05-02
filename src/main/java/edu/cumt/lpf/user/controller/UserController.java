package edu.cumt.lpf.user.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cumt.lpf.user.service.UserService;
import edu.cumt.lpf.util.MD5;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private MD5 md5;
	@Autowired
	private UserService userService;

	@RequestMapping("/md")
    public Map<String, Object>  md(String username, String password) {
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		String salt = md5.getSalt();
		resultMap.put("salt", salt);
		resultMap.put("password", md5.md5Password(password,salt));
		return resultMap;
    }
	
	@RequestMapping("/login")
    public Map<String, Object>  Login(String username, String password) {
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		try {
			
			UsernamePasswordToken  token = new UsernamePasswordToken (username, password);
			log.info(username+"：进入角色认证");
			SecurityUtils.getSubject().login(token);
			resultMap.put("status", 200);
			resultMap.put("message", "登录成功");
			log.info(username+"：角色认证成功");
		} catch (Exception e) {
			resultMap.put("status", 500);
			resultMap.put("message", e.getMessage());
			log.info(username+"：角色认证失败");
		}
		return resultMap;
    }
	

}
