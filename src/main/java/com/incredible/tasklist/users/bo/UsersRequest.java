package com.incredible.tasklist.users.bo;

import java.util.ArrayList;

public class UsersRequest {

	String username;
	String password;
	String sysuserid;
	String taskspacename;
	String taskspacedesc;
	String firstName;
	String lastName;
	String middleName;
	int usertype;
	int taskspaceid;

	ArrayList<UsersBO> children;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

}
