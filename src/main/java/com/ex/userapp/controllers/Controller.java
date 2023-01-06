package com.ex.userapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex.userapp.response.Response;
import com.ex.userapp.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class Controller {
	@Autowired
	UserService userService;

	@PostMapping(value = "/authenticate")
	public Response authenticate(@RequestParam String un, @RequestParam String pwd) {
		userService.authenticate(un, pwd);
		Response response = new Response();
		response.setStatus(200);
		response.setMessage("SUCCESS");
		response.setData(un);
		return response;

	}
}
