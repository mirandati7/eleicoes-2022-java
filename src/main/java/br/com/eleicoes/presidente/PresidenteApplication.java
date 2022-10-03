package br.com.eleicoes.presidente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PresidenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresidenteApplication.class, args);
	}

}
