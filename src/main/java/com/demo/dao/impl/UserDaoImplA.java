package com.demo.dao.impl;

import com.demo.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("UserDaoImplA")
public class UserDaoImplA implements UserDao {
    @Override
    public void add() {
        System.out.println(this.getClass() + " user Dao add executed");
    }

    public int addUser(Integer userid, String username) {
        System.out.println("userdao add ... ...");
        //int i =1/0;
        return 1;
    }
}
