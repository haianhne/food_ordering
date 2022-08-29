package com.n37.foodordering.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableWebSecurity
@EnableTransactionManagement

public class SercurityConfig {
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.formLogin(form -> form
				.loginPage("/login")
				.permitAll()
				.defaultSuccessUrl("/login?success=true")
				.failureUrl("/login?success=fail")
				.loginProcessingUrl("/j_spring_security_check")
			)
			.authorizeHttpRequests()
		 	.antMatchers("/admin").hasRole("ADMIN")
		 	.antMatchers("/home").hasAnyRole("ADMIN", "USER", "RESTAURANT")
		 	.antMatchers("/login").permitAll()
		 	.antMatchers("/").permitAll()
		 	;
		return http.build();
	     
	}     
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/css/**","/fonts/**","/images/**","/js/**","/vendor/**","/scss/**");
	}
	
	@Bean
	public UserDetailsService userDetailsService() {

	final User.UserBuilder userBuilder = User.builder();
	UserDetails user = userBuilder
	.username("user")
	.password("{bcrypt}$2a$10$LSRtafm7G18bebaAYfgUnetAH7m/T24ZAGdFQb34KBRR/LOIQkwtC")
	.roles("USER")
	.build();

	UserDetails admin = userBuilder
	.username("admin")
	.password("{bcrypt}$2a$10$LSRtafm7G18bebaAYfgUnetAH7m/T24ZAGdFQb34KBRR/LOIQkwtC")
	.roles("USER","ADMIN")
	.build();
	
	UserDetails restaurant = userBuilder
	.username("restaurant")
	.password("{bcrypt}$2a$10$LSRtafm7G18bebaAYfgUnetAH7m/T24ZAGdFQb34KBRR/LOIQkwtC")
	.roles("USER","RESTAURANT")
	.build();

	return new InMemoryUserDetailsManager(user, admin, restaurant);
	}
		
}

