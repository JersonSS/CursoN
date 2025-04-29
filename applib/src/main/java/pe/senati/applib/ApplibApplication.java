package pe.senati.applib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pe.senati")
public class ApplibApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplibApplication.class, args);
	}

}
