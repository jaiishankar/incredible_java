package com.incredible.tasklist.users.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incredible.tasklist.users.bo.LoginRequest;

@RestController
@RequestMapping("/users")
public class UsersController {

	@PostMapping(value = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Object> login(@RequestBody LoginRequest logdata) {
		System.out.println(logdata.toString());
		return new ResponseEntity<Object>("Under Contruction", HttpStatus.OK);
	}
}
