package com.macro.springboot.mapper;

import com.macro.springboot.entity.Client;
import org.apache.ibatis.annotations.Select;


public interface ClientMapper {

	@Select("select * from [Client] where client_id = #{clientId}")
	Client findClientById(String client);

}
