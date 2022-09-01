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
		http
			.formLogin(form -> form
				.loginPage("/login")
				.permitAll()
				.defaultSuccessUrl("/")
				.failureUrl("/login?success=fail")
				.loginProcessingUrl("/j_spring_security_check")
			)
			.authorizeHttpRequests()
		 	.antMatchers("/admin/**").hasAnyAuthority("ADMIN", "RESTAURANT")
		 	.antMatchers("/").permitAll()
		 	;
		return http.build();
	     
	}     
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/css/**","/fonts/**","/images/**","/js/**","/vendor/**","/scss/**");
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
//	@Bean
//	public UserDetailsService userDetailsService() {
//
//	final User.UserBuilder userBuilder = User.builder();
//	UserDetails user = userBuilder
//	.username("user")
//	.password("$2a$10$LSRtafm7G18bebaAYfgUnetAH7m/T24ZAGdFQb34KBRR/LOIQkwtC")
//	.roles("USER")
//	.build();
//
//	UserDetails admin = userBuilder
//	.username("admin")
//	.password("$2a$10$LSRtafm7G18bebaAYfgUnetAH7m/T24ZAGdFQb34KBRR/LOIQkwtC")
//	.roles("USER","ADMIN")
//	.build();
//	
//	UserDetails restaurant = userBuilder
//	.username("restaurant")
//	.password("$2a$10$LSRtafm7G18bebaAYfgUnetAH7m/T24ZAGdFQb34KBRR/LOIQkwtC")
//	.roles("USER","RESTAURANT")
//	.build();
//
//	return new InMemoryUserDetailsManager(user, admin, restaurant);
//	}
		
}

