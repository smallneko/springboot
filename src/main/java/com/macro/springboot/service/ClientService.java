package com.macro.springboot.service;

import com.macro.springboot.entity.Client;

import java.util.List;

public interface ClientService {

	Client findClientById(String clientId);

	List<Client> findAllClient();

	int getCount();

}
