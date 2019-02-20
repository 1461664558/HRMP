package com.company.hrm.dao.impl;

import com.company.hrm.dao.pojo.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDaoImplTest extends UserDaoImpl {

    private UserDaoImpl udi;

    @Before
    public void setUp() throws Exception {
        udi = new UserDaoImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void regist() throws Exception{
        User user = new User("123","123",1);
        String msg = udi.regist(user);
        System.out.println(msg);
    }

    @Test
    public void login() {
    }

    @Test
    public void isExist() {
    }

    @Test
    public void regist1() {
    }

    @Test
    public void login1() {
    }

    @Test
    public void isExist1() {
    }
}
