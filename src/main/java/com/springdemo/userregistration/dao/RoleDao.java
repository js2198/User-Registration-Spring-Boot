package com.springdemo.userregistration.dao;

import com.springdemo.userregistration.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
