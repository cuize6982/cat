package com.cz.cat.catbabyCat.web;

import com.cz.cat.catbabyCat.dao.UserMapper;
import com.cz.cat.catbabyCat.entity.testEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping(value = "cs")
    public String cs() {
        //调用dao层
        testEntity user = userMapper.selectUserByName("aaaa11");
        System.out.println(user);
        return "hello";
    }
}
