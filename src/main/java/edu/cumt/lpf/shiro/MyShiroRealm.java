package edu.cumt.lpf.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import edu.cumt.lpf.user.pojo.Permission;
import edu.cumt.lpf.user.pojo.Role;
import edu.cumt.lpf.user.pojo.User;
import edu.cumt.lpf.user.service.UserService;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User user = (User)principals.getPrimaryPrincipal();
        for(Role role:user.getRoleList()){
            authorizationInfo.addRole(role.getRoleName());
            for(Permission p:role.getPermissionList()){
                authorizationInfo.addStringPermission(p.getPermissionPermission());
            }
        }
        return authorizationInfo;
    }

    /*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        //获取用户的输入的账号.
        String username = (String)token.getPrincipal();
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        User user = userService.findUserByName(username);
        if(user == null){
            return null;
        }
        ByteSource byteSource = ByteSource.Util.bytes(user.getSalt());
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, //用户名
                user.getUserPassword(), //密码
                byteSource,//salt=username+salt
                this.getClass().getName()  //realm name
        );
        return authenticationInfo;
    }
    
}

