package com.jsp.dao;

import com.jsp.dataSet.UserList;
import com.jsp.model.User;

import java.util.Optional;
import java.util.Set;

public class DaoUserSet implements DaoUsers {

    private UserList userList;

    public DaoUserSet() {
        this.userList = new UserList();
    }

    @Override
    public Set getAllUsers() {
        return userList.getUsers();
    }

    @Override
    public User getUserByName(String name) {

        User theUser = null;

        for(User user : userList.getUsers()){
            if(user.getLogin().equals(name)){
                theUser = user;

            }
        }

        return theUser;

    }
}
