package com.echo.loginpage;

import com.echo.loginapp.dao.UserDAO;
import com.echo.loginapp.dao.UserDAOinMemory;
import com.echo.loginapp.model.User;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by UserA on 7/1/2015.
 */
public class UserDAOTest {

    UserDAO userDAO = new UserDAOinMemory();

    @Test
    public void testFindUserByID(){
        Assert.assertEquals(new User("Mihai"),userDAO.findUserByUsername("Mihai"));
    }
}
