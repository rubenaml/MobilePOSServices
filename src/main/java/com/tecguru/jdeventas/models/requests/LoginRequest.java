package com.tecguru.jdeventas.models.requests;

public class LoginRequest extends Request{
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
