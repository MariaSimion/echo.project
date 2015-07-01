package com.echo.loginapp.dao;

import com.echo.loginapp.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maria Simion on 30.06.2015.
 */

public class UserDAOInMemory implements UserDAO {

    final List<User> userList = new ArrayList<User>();

    {
        userList.add(0, new User("maria", "123456"));
        userList.add(1, new User("mariasimion", "1q2w3e4r5t"));
        userList.add(2, new User("mariaalexandra", "simion"));
    }

    public User findUserByUsername(String username) {
        User userToFind = new User(username);
        for(User user : userList){
            if(user.equals(userToFind)){
                return user;
            }
        }
        return null;
    }


}
