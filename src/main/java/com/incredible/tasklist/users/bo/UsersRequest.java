package com.incredible.tasklist.users.bo;

public class UsersRequest {

	String username;
	String password;
	String sysuserid;
	int usertype;
	int taskspaceid;
	String taskspacename;
	String taskspacedesc;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSysuserid() {
		return sysuserid;
	}

	public void setSysuserid(String sysuserid) {
		this.sysuserid = sysuserid;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	public int getTaskspaceid() {
		return taskspaceid;
	}

	public void setTaskspaceid(int taskspaceid) {
		this.taskspaceid = taskspaceid;
	}

	public String getTaskspacename() {
		return taskspacename;
	}

	public void setTaskspacename(String taskspacename) {
		this.taskspacename = taskspacename;
	}

	public String getTaskspacedesc() {
		return taskspacedesc;
	}

	public void setTaskspacedesc(String taskspacedesc) {
		this.taskspacedesc = taskspacedesc;
	}

}
