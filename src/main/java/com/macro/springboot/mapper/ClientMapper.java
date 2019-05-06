package com.macro.springboot.mapper;

import com.macro.springboot.entity.Client;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ClientMapper {

	@Select("select * from [Client] where client_id = #{clientId}")
	Client findClientById(String client);

	@Select("select * from [Client] where 1=1")
	List<Client> findAllClient();

	@Select("select COUNT(*) as total from [Client]")
	int getCount();

}
