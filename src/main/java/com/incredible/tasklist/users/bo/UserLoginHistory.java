package com.incredible.tasklist.users.bo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLoginHistory {

	String username;
	String txntype;
	LocalDateTime txnts;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTxntype() {
		return txntype;
	}

	public void setTxntype(String txntype) {
		this.txntype = txntype;
	}

	@JsonProperty("txntimestamp")
	public LocalDateTime getTxnts() {
		return txnts;
	}

	public void setTxnts(LocalDateTime txnts) {
		this.txnts = txnts;
	}

}
