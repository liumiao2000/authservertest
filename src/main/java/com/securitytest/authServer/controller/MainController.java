package com.securitytest.authServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String main() {
		return "这里是主页";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "这里是admin页";
	}
	
	@GetMapping("/user")
	public String user() {
		return "这里是user页";
	}
}
