package com.tigerlogistics.gateway.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import com.tigerlogistics.gateway.security.CustomAuthenticationEntryPoint;
import com.tigerlogistics.gateway.security.JwtAuthenticationFilter;
import com.tigerlogistics.gateway.service.impl.JwtUserDetailServiceImpl;

import lombok.AllArgsConstructor;

@EnableWebSecurity
@Configuration
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private JwtAuthenticationFilter jwtAuthenticationFilter;
	private JwtUserDetailServiceImpl userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors()
		.configurationSource(request -> {
			CorsConfiguration cors= new CorsConfiguration();
			cors.applyPermitDefaultValues();
			cors.setAllowedMethods(Arrays.asList("GET","HEAD","POST","DELETE","PUT"));
			return cors;
		}).and()
		.csrf().disable()
		.authorizeRequests().antMatchers("/tigerlogistics-auth-service/**","/actuator/**","/**/swagger*/**","/**/v2/api-doc")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.exceptionHandling()
		.authenticationEntryPoint(authenticationEntryPoint());
		http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		http.headers()
		.frameOptions()
		.disable();
		
	}
	
	
	public AuthenticationEntryPoint authenticationEntryPoint() {
	    return new CustomAuthenticationEntryPoint();
	  }
	
	@Bean 
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		
	}
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}

}
