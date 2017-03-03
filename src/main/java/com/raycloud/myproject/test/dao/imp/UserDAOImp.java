package com.raycloud.myproject.test.dao.imp;

import com.alibaba.cobar.client.CobarSqlMapClientDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.raycloud.myproject.test.dao.IUserDAO;
import com.raycloud.myproject.test.entity.User;
import com.raycloud.myproject.test.entity.UserPage;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 001117020015 on 2017/2/23.
 */

public class UserDAOImp extends CobarSqlMapClientDaoSupport implements IUserDAO {
    @Autowired
    SqlMapClient  sqlMapClient;
    @PostConstruct
    public void initSqlMapClient(){
        super.setSqlMapClient(sqlMapClient);
    }
    public List<String> queryByName(int page ,String name) {
        UserPage userPage = new UserPage(3*page-3,name);
        List<User> users=super.getSqlMapClientTemplate().queryForList("queryByName",userPage);
        List<String> list=new ArrayList<String>();
        for(User u:users){
            list.add(u.getAddress());
        }
        return list;
    }

    @Override
    public User queryById(int id) {
        User user = (User)super.getSqlMapClientTemplate().queryForObject("queryById", id);
        return user;
    }
}
