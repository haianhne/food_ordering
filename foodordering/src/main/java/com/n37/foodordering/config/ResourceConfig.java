package com.n37.foodordering.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ResourceConfig implements WebMvcConfigurer {
	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
	        "classpath:main/resources/static", "classpath:/resources/static",
	        "classpath:/static/", "classpath:/resources/"
	};
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry
		.addResourceHandler("/**")
		.addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);

	}
	
}

