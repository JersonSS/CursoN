package pe.senati.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test 
{
	public Test() {}
	
	@GetMapping("/welcome")
	public ResponseEntity<?> welcomeRest() {
		return new ResponseEntity<>("Hello World with Spring REST!",HttpStatus.OK);
	}
}
