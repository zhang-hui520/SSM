package com.hui.spring.dao.impl;

import com.hui.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功！！！");
    }
}
