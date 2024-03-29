package com.incredible.tasklist.users.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incredible.tasklist.users.bo.UsersRequest;
import com.incredible.tasklist.users.bo.UsersResponse;

import io.swagger.annotations.Api;

@Api(description="User onboard Action APIs", tags = "User Onboard Actions")
@RestController
@RequestMapping("/users/")
public class UserOnboardController {

	@PostMapping(value = "/signup", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UsersResponse> signup (@RequestBody UsersRequest user){
		return null;
	}
	
	@PostMapping(value = "/signup/child", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UsersResponse> signupChild (@RequestBody UsersRequest user){
		return null;
	}
	
	@PostMapping(value = "/cancel", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UsersResponse> cancel (){
		return null;
	}
	
	@PostMapping(value = "/invite", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UsersResponse> invite (){
		return null;
	}
	
}
