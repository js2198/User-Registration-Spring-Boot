package com.springdemo.userregistration.dao;

import com.springdemo.userregistration.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
