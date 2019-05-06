package com.macro.springboot.controller;

import com.macro.springboot.entity.Client;
import com.macro.springboot.service.ClientService;
import com.macro.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/*")
public class SingleViewController {

	@Autowired
	ClientService clientService;
	@Autowired
	UserService userService;

	// Index页面返回方式
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(Model model){
		List<Client> clientList = clientService.findAllClient();

		model.addAttribute(clientList);
		return "index";
	}

}
