package com.bookmanagementsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmanagementsystem.service.UserService;
@RestController
@RequestMapping("/auth")
public class UserAuthController {
	public UserService userService;
	

}
