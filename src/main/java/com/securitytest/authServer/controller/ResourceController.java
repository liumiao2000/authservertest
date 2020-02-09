package com.securitytest.authServer.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/me")
	public Principal me(Principal principal) {
		return principal;
	}
	
	@RequestMapping("/phone")
	public String phone() {
		return "phone 1234567890";
	}
}
