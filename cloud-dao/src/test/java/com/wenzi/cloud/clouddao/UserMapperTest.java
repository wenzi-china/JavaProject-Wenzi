package com.wenzi.cloud.clouddao;

import com.wenzi.cloud.clouddao.entity.User;
import com.wenzi.cloud.clouddao.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetAllUser(){
        List<User> userList = userMapper.getAllUser();
        System.out.println("----------------------userList-------------");
        System.out.println(userList.get(0).toString());
    }
}
