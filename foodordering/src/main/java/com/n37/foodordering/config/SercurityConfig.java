package com.n37.foodordering.config;


import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.n37.foodordering.service.CustomUserDetailService;


@Configuration
@EnableWebSecurity
@EnableTransactionManagement

public class SercurityConfig {
	
	@Autowired
	CustomUserDetailService customUserDetailService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeHttpRequests()
		 	.antMatchers("/admin/**", "/restaurant-manager", "/user-manager").hasAnyAuthority("ADMIN")
		 	.antMatchers("/restaurant", "/food-manager").hasAnyAuthority("RESTAURANT")
		 	.antMatchers("/").permitAll()
		 	.and()
		 	.formLogin(form -> form
				.loginPage("/login")
				.permitAll()
				.defaultSuccessUrl("/")
				.failureUrl("/login?success=fail")
				.loginProcessingUrl("/j_spring_security_check")
			)
		 	.logout(logout -> logout
		 			.clearAuthentication(true)
		 			.invalidateHttpSession(false)
		 			.logoutUrl("/logout")
		 			.logoutSuccessUrl("/login")
		 	)
		 	;
		return http.build();
	     
	}    
	
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/css/**","/fonts/**","/images/**","/js/**","/vendor/**","/scss/**",
				"/registration","/res_registration","/fooddetails", "/forgotpass" );
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
		
}

