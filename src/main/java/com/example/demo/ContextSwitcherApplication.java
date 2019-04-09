package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ContextSwitcherApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ContextSwitcherApplication.class);


	public static void main(String[] args) throws UnknownHostException {
		
		ConfigurableApplicationContext app = SpringApplication.run(ContextSwitcherApplication.class, args);
		ConfigurableEnvironment env = app.getEnvironment();
		log.info(
				"\n----------------------------------------------------------\n\t" + "Application '{}' is running! Access URLs:\n\t"
						+ "Local: \t\thttp://localhost:{}\n\t"
						+ "External: \thttp://{}:{}\n----------------------------------------------------------",
				env.getProperty("spring.application.name"), //
				env.getProperty("server.port"), //
				InetAddress.getLocalHost().getHostAddress(), //
				env.getProperty("server.port"));//
	}

}
