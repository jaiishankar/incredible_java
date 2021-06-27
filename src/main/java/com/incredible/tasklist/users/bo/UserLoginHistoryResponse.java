package com.incredible.tasklist.users.bo;

import java.util.ArrayList;

public class UserLoginHistoryResponse {

	ArrayList<UserLoginHistory> history;

	public ArrayList<UserLoginHistory> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<UserLoginHistory> history) {
		this.history = history;
	}

}
