package com.only.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Radio radio() {
		Radio radio = new Radio();
		radio.setType("AM");
		return radio;
	}
	
	@Bean
	public Radio radio_1() {
		Radio radio = new Radio();
		radio.setType("FM");
		return radio;
	}
}
