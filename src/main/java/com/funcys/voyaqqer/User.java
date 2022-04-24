package com.funcys.voyaqqer;

import lombok.Data;

@Data
public class User {
	private String userId;
	private String userName;
	private int userAge;


	public void setUserId(String id) {
		userId = id;

	}

	public void setUserName(String name) {
		userName = name;
	}

	public void setUserAge(int age) {
		userAge = age;
	}
	public String getUserId() {
		return this.userId;

	}

	public String getUserName() {
		return this.userName;
	}

	public int getUserAge() {
		return this.userAge;
	}
}
