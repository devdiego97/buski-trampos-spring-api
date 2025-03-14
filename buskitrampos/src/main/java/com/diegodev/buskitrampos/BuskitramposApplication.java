package com.diegodev.buskitrampos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //habilita auditoria
public class BuskitramposApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuskitramposApplication.class, args);
	}

}
