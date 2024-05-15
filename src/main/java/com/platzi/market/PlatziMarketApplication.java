package com.platzi.market;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatziMarketApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("jajaj Emojis???");
	}
}
