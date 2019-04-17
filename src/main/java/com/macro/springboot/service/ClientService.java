package com.macro.springboot.service;

import com.macro.springboot.entity.Client;

public interface ClientService {

	Client findClientById(String clientId);

}
