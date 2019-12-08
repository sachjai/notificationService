package com.myproject.notification;

import org.springframework.beans.factory.annotation.Value;

public class JwtConfig {
	
	@Value("${security.jwt.uri:/auth/**}")
	private String Uri;
	@Value("${security.jwt.header:Authorization}")
	private String header;
	@Value("${security.jwt.expiration:#{5*60}}")
	private int expiration;
	@Value("${security.jwt.secret:JwtSecretKey}")
	private String secret;
	@Value("${security.jwt.prefix:Bearer }")
    private String prefix;
	
	public String getUri() {
		return Uri;
	}
	public String getHeader() {
		return header;
	}
	public int getExpiration() {
		return expiration;
	}
	public String getSecret() {
		return secret;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	
	
	

}
