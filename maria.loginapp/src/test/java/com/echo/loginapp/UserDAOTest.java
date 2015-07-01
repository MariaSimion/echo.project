package com.echo.loginapp;

import com.echo.loginapp.dao.UserDAO;
import com.echo.loginapp.dao.UserDAOInMemory;
import com.echo.loginapp.model.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maria Simion on 30.06.2015.
 */
public class UserDAOTest {


    UserDAO userDAO = new UserDAOInMemory();

    @Test
    public void testFindUserByUsername() {

        Assert.assertEquals(new User("maria") ,userDAO.findUserByUsername("maria"));
    }

}
