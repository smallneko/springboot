package com.macro.springboot.service.impl;

import com.macro.springboot.base.impl.BaseServiceImpl;
import com.macro.springboot.entity.Client;
import com.macro.springboot.entity.User;
import com.macro.springboot.mapper.ClientMapper;
import com.macro.springboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

	@SuppressWarnings("all")
	@Autowired
	ClientMapper clientMapper;

	@Override
	public Client findClientById(String clientId) {
		return clientMapper.findClientById(clientId);
	}

	@Override
	public List<Client> findAllClient(){
		return clientMapper.findAllClient();
	}

	@Override
	public int getCount(){
		return  clientMapper.getCount();
	}
}
