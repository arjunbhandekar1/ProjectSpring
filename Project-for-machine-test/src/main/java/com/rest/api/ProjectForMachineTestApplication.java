package com.rest.api;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.api.entity.Order;

@SpringBootApplication
public class ProjectForMachineTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectForMachineTestApplication.class, args);
	
		Order o = new Order();
		
		o.setDate(new Date());
		o.setStatus("Dispatched...");
	
		
	}

}
