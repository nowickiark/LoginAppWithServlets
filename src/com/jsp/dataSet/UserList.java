package com.jsp.dataSet;

import com.jsp.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserList {

    private Set<User> users = new HashSet<User>();

    public UserList(){

        users.add(new User("admin", "admin"));
        users.add(new User("arek","123"));

    }


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
