package com.viaplay.karamat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KaramatApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaramatApplication.class, args);
	}

}
