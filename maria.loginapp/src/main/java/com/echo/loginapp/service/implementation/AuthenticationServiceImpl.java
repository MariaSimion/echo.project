package com.echo.loginapp.service.implementation;

import com.echo.loginapp.dao.UserDAO;
import com.echo.loginapp.dao.UserDAOInMemory;
import com.echo.loginapp.model.User;
import com.echo.loginapp.service.AuthenticationService;

/**
 * Created by Maria Simion on 30.06.2015.
 */
public class AuthenticationServiceImpl implements AuthenticationService {


    UserDAO userDAO = new UserDAOInMemory();

    public Boolean isUserAuthenticated(String username, String password) {

        User userExpect = userDAO.findUserByUsername(username);
        if (userExpect.getUsername().equals(username) && userExpect.getPassword().equals(password)) {
            return true;
        }
        return null;
    }
}
