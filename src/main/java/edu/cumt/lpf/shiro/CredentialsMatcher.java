package edu.cumt.lpf.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.springframework.beans.factory.annotation.Autowired;

import edu.cumt.lpf.user.pojo.User;
import edu.cumt.lpf.util.MD5;

public class CredentialsMatcher extends SimpleCredentialsMatcher{
	@Autowired
	private MD5 md5;
	
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken utoken=(UsernamePasswordToken) token;
        //获得用户输入的密码:(可以采用加盐(salt)的方式去检验)
        String inPassword = new String(utoken.getPassword());
        //获得数据库中的密码
        String dbPassword=(String) info.getCredentials();
        //进行密码的比对md
        User user = (User) info.getPrincipals().getPrimaryPrincipal();
        return this.equals(md5.md5Password(inPassword, user.getSalt()), dbPassword);
    }
    
}