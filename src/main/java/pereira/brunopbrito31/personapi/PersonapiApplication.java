package pereira.brunopbrito31.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pereira.brunopbrito31.personapi.entity.Person;
import pereira.brunopbrito31.personapi.repository.PersonRepository;

@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonapiApplication.class, args);
	}


}
