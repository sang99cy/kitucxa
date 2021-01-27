package org.o7planning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class QuanLiKiTucXaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanLiKiTucXaApplication.class, args);
	}

}
