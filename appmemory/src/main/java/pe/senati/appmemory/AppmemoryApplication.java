package pe.senati.appmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pe.senati")
public class AppmemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppmemoryApplication.class, args);
	}

}
