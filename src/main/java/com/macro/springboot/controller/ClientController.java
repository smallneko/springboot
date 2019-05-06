package com.macro.springboot.controller;

import com.macro.springboot.pojo.R;
import com.macro.springboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client/*")
public class ClientController {

	@Autowired
	ClientService clientService;

	/*
	 * findClientById/{clientId}
	 * */
	@RequestMapping(value = "findClient/{clientId}", method = RequestMethod.GET)
	public R findClientById(@PathVariable("clientId") String clientId) {
		try {
			return R.isOk().data(clientService.findClientById(clientId));
		} catch (Exception e) {
			return R.isFail(e);
		}
	}

	@RequestMapping(value = "findAllClient", method = RequestMethod.GET)
	public R findAllClient(){
		try {
			return R.isOk().data(clientService.findAllClient()).total(clientService.getCount());
		}catch (Exception e){
			return R.isFail(e);
		}
	}

	/*
	* findClientById?clientId={clientId}
	* */
	@RequestMapping(value = "findClientById",method = RequestMethod.GET)
	public R findClientByClientId(@RequestParam("clientId") String clientId){
		try {
			return R.isOk().data(clientService.findClientById(clientId));
		} catch (Exception e) {
			return R.isFail(e);
		}
	}

}
