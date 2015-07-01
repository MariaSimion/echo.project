package com.echo.loginapp.dao;

import com.echo.loginapp.model.User;

/**
 * Created by Maria Simion on 30.06.2015.
 */
public interface UserDAO {

    public User findUserByUsername(String user);

}
