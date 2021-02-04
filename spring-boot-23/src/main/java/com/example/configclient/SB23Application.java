package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SB23Application {

	@Value("${value}")
	private String propertyValue;

	public static void main(String[] args) {
		SpringApplication.run(SB23Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onReady() {
		System.err.println("Resolved value is '" + propertyValue + "'");
	}
}
