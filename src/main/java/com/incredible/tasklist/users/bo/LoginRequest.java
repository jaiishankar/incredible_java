package com.incredible.tasklist.users.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class LoginRequest {

	@ApiModelProperty(notes="Required field for all requests")
	String username;
	String passcode;
	String pincode;
	String sysuserid;
	
	public String getSysuserid() {
		return sysuserid;
	}

	public void setSysuserid(String sysuserid) {
		this.sysuserid = sysuserid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {

		return username + ":" + passcode + "--" + pincode;
	}
}
