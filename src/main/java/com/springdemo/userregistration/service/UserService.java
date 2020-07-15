package com.springdemo.userregistration.service;

import com.springdemo.userregistration.entity.User;
import com.springdemo.userregistration.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
