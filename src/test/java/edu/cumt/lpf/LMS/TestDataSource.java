package edu.cumt.lpf.LMS;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.cumt.lpf.BootStart;
import edu.cumt.lpf.user.mapper.UserMapper;
import edu.cumt.lpf.user.pojo.UserExample;

@SpringBootTest(classes = BootStart.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDataSource {   
      @Resource   
      private DataSource dataSource; 
      @Autowired
      private UserMapper userMapper;
     @Test   
     public void testConnection() throws Exception{    
        UserExample example = new UserExample();
        edu.cumt.lpf.user.pojo.UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo("林鹏飞");
        System.out.println(userMapper.selectByExample(example).isEmpty());
     }   
}
