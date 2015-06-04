package com.sport.domain;

public class LoginForm {

	private String emailAddress;
	private String password;
	
	private boolean rememberMe;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememeberMe) {
		this.rememberMe = rememeberMe;
	}
}
