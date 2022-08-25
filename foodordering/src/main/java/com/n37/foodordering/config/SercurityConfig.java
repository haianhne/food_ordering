package com.n37.foodordering.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SercurityConfig {
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	 
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		 	.authorizeRequests()
		 	.antMatchers("/home")
		 	.permitAll()
		 	.anyRequest().authenticated()
		 	.and()
		 	.formLogin()
		 	.loginPage("/login")
		 	.permitAll();
		return http.build();
	     
	}     
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/css/**","/fonts/**","/images/**","/js/**","/vendor/**");
	}
	 
	@Bean
	public AuthenticationManager authenticationManager(
	        AuthenticationConfiguration authConfig) throws Exception {
		
	    return authConfig.getAuthenticationManager();
	}
	 
	 
	
}

