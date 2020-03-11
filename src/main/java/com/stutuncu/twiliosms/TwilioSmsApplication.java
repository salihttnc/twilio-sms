package com.stutuncu.twiliosms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TwilioSmsApplication {

	public static void main(String[] args) { SpringApplication.run(TwilioSmsApplication.class, args);
	}

}
