package com.myproject.notification;

import org.springframework.web.client.RestTemplate;

public class TokenStore {
	
	public Boolean validateToken(String username, String token)
	{
	    final String uri = "http://localhost:8080/validateToken";
	 
	    Token objToken = new Token();
	    objToken.setToken(token);
	    objToken.setUsername(username);
	 
	    RestTemplate restTemplate = new RestTemplate();
	    TokenValidity tokenValidity = restTemplate.postForObject( uri, objToken, TokenValidity.class);
	    System.out.println(tokenValidity);
	    return tokenValidity.getTokenValid();
	    
	}

}
