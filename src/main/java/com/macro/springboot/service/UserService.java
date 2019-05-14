package com.macro.springboot.service;

import com.macro.springboot.base.BaseService;
import com.macro.springboot.entity.User;

public interface UserService extends BaseService<User> {
	User findUserByName(String username);
}
