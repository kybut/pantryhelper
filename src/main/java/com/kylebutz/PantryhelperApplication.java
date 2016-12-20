package com.kylebutz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PantryhelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(PantryhelperApplication.class, args);
	}

	@Bean
	HealthIndicator healthIndicator () {
		return  () -> Health.status("A status").build();
	}

	@Bean
	CommandLineRunner runner (GroceryItemRepository groceryItemRepository) {
		return args -> {
			groceryItemRepository.save(new GroceryItem("eggs","2 cartons", false));
			groceryItemRepository.save(new GroceryItem("brie","the cheap stuff", false));
			groceryItemRepository.save(new GroceryItem("coffee","decent stuff", false));
		};
	}
}
