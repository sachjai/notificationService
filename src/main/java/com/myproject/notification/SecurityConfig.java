package com.myproject.notification;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public JwtConfig jwtConfig()
	{
		return new JwtConfig();
	}
	
	@Autowired
	private JwtConfig jwtConfig;
	
	@Override
  	protected void configure(HttpSecurity http) throws Exception 
  	{
		http
		.csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
			.exceptionHandling().authenticationEntryPoint((req,rsp,e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED))
		.and()
			.addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
		.authorizeRequests()
		.antMatchers(HttpMethod.POST, jwtConfig.getUri()).permitAll() 
		.anyRequest().authenticated(); 
  	}
	
}
