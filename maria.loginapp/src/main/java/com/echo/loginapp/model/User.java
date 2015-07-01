package com.echo.loginapp.model;

/**
 * Created by Maria Simion on 30.06.2015.
 */
public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object object) {
        User other = (User) object;

        return this.username.equals(other.getUsername());
    }
}
