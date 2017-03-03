package com.raycloud.myproject.test.controller;
import com.raycloud.myproject.test.dao.imp.UserDAOImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by 001117020015 on 2017/2/22.
 */
public class Dubbo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/spring-web-datasource.xml"});
        System.out.println("生产者二启动");
        context.start();
        UserDAOImp userDAOImp = (UserDAOImp) context.getBean("userDAO");
        int page=1;
        String name="admin";
        List<String> user = userDAOImp.queryByName(page,name);
        System.out.println(user);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

