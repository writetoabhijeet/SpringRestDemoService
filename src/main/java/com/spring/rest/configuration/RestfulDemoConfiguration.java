package com.spring.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by USER on 29-09-2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.rest")
public class RestfulDemoConfiguration {
	

}