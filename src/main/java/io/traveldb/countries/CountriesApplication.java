package io.traveldb.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

}
