package com.cz.cat.catbabyCat.dao;

import com.cz.cat.catbabyCat.entity.testEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    testEntity selectUserByName(String name);
}
