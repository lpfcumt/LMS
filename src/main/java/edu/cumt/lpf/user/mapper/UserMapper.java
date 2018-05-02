package edu.cumt.lpf.user.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.cumt.lpf.user.pojo.User;
import edu.cumt.lpf.user.pojo.UserExample;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe UserDao接口类
 * @time 2018年4月18日下午5:18:12
 */
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer rowid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer rowid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}