package com.myproject.notification;

public class Token {
	private int id;
	private String username;
	private String token;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "Token [id=" + id + ", username=" + username + ", token=" + token + "]";
	}
	public Token(int id, String username, String token) {
		super();
		this.id = id;
		this.username = username;
		this.token = token;
	}
	
	
	public Token() {
	}
}
