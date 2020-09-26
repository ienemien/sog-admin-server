package nl.ivermeul.sogadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SogAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SogAdminServerApplication.class, args);
	}

}
