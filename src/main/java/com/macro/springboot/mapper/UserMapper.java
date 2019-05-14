package com.macro.springboot.mapper;

import com.macro.springboot.entity.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * 继承通用Mapper获取CURD方法
 */
public interface UserMapper extends Mapper<User> {
	@Select("select * from [User] where username = #{username}")
	User findUserByName(String username);
}
