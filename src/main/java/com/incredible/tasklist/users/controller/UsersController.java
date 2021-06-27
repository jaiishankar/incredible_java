package com.incredible.tasklist.users.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incredible.tasklist.users.bo.LoginRequest;
import com.incredible.tasklist.users.bo.LoginResponse;

@RestController
@RequestMapping("/users")
public class UsersController {

	@PostMapping(value = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest logdata) {
		System.out.println(logdata.toString());
		LoginResponse result = new LoginResponse();
		result.setStatus("Success");
		result.setSession_id("a7bnan3k73n");
		return new ResponseEntity<LoginResponse>(result, HttpStatus.OK);
	}
	
	@PostMapping(value = "/logout", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<LoginResponse> logout(@RequestBody LoginRequest logdata) {
		System.out.println(logdata.toString());
		LoginResponse result = new LoginResponse();
		result.setStatus("Success");
		return new ResponseEntity<LoginResponse>(result, HttpStatus.OK);
	}
	
	@PostMapping(value = "/activate", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<LoginResponse> activate(@RequestBody LoginRequest logdata) {
		System.out.println(logdata.toString());
		LoginResponse result = new LoginResponse();
		result.setStatus("Success");
		return new ResponseEntity<LoginResponse>(result, HttpStatus.OK);
	}

	@PostMapping(value = "/deactivate", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<LoginResponse> deactivate(@RequestBody LoginRequest logdata) {
		System.out.println(logdata.toString());
		LoginResponse result = new LoginResponse();
		result.setStatus("Success");
		return new ResponseEntity<LoginResponse>(result, HttpStatus.OK);
	}

}
