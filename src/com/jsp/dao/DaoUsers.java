package com.jsp.dao;

import com.jsp.model.User;

import java.util.Set;

public interface DaoUsers {

    public Set getAllUsers();
    public User getUserByName(String name);


}
