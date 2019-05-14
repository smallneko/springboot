package com.macro.springboot.controller;

import com.macro.springboot.entity.Client;
import com.macro.springboot.entity.User;
import com.macro.springboot.service.ClientService;
import com.macro.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SingleViewController {

	@Autowired
	ClientService clientService;
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(){
		return "login";
	}

	// Index页面返回方式
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model){
		List<Client> clientList = clientService.findAllClient();

		model.addAttribute(clientList);
		return "index";
	}

	public User getUser(){
		User user = new User();
		SecurityContext ctx = SecurityContextHolder.getContext();
		Authentication auth = ctx.getAuthentication();
		if (auth.getPrincipal() instanceof UserDetails) user = (User) auth.getPrincipal();
		return user;
	}

	public HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

}
