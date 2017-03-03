package com.raycloud.myproject.test.dao;

import com.raycloud.myproject.test.entity.User;

import java.util.List;

/**
 * Created by 001117020015 on 2017/2/23.
 */
public interface IUserDAO {
    /*根据用户名查找用户*/
    public List<String> queryByName(int page, String name);
    public User queryById(int id);


}
