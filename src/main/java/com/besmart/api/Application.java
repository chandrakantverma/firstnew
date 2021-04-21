package com.besmart.api;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.besmart.api.healthtip.controller.healthtipControllerImpl;

@SpringBootApplication
public class Application {


	private static final Logger LOG =  LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {

	    LOG.info("Welcome to the application");
			SpringApplication.run(Application.class, args);



	}

}
