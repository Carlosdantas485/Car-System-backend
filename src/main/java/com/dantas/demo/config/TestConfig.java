package com.dantas.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dantas.demo.entities.Car;
import com.dantas.demo.repositories.CarRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private CarRepository carRepository;

	@Override
	public void run(String... args) throws Exception {

		Car u1 = new Car(null,1,"black", 300, "unico dono", 2010);
		Car u2 = new Car(null,1, "black", 400, "unico dono", 2010);
 
		carRepository.saveAll(Arrays.asList(u1, u2));

	}
}
