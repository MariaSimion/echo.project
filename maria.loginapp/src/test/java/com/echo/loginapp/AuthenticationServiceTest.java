package com.echo.loginapp;

import com.echo.loginapp.model.User;
import com.echo.loginapp.service.AuthenticationService;
import com.echo.loginapp.service.implementation.AuthenticationServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maria Simion on 01.07.2015.
 */
public class AuthenticationServiceTest {

    AuthenticationService authenticationService = new AuthenticationServiceImpl();

    @Test
    public void testUserIsNotAuthenticated() {

        Assert.assertTrue(authenticationService.isUserAuthenticated("maria", "123456"));
    }
}
