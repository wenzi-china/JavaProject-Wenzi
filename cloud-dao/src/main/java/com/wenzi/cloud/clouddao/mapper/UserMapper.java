package com.wenzi.cloud.clouddao.mapper;

import com.wenzi.cloud.clouddao.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有的用户信息
     *
     * @return user 实体列表
     */
    List<User> getAllUser();

    /**
     * 根据用户id查询其用户信息
     *
     * @param id 用户id
     * @return user
     */
    User getUserById(String id);

    /**
     * 新增user
     *
     * @param user
     * @return 成功：1，失败：不等于1
     */
    int addUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return 成功：1，失败：不等于1
     */
    int updateUser(User user);

    /**
     * 根据用户id删除用户信息
     *
     * @param id
     * @return 成功：1，失败：不等于1
     */
    int deleteUser(String id);
}
