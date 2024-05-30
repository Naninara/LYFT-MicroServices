package com.LYFT.RideMicroService;

import com.LYFT.RideMicroService.Models.RideModel;
import com.LYFT.RideMicroService.Services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RideMicroServiceApplication {

	@Autowired
	RideService rideService;

	public static void main(String[] args) {
		SpringApplication.run(RideMicroServiceApplication.class, args);
	}


}
