package br.com.professorisidro.fateczl.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Bem vindos ao exemplo do CI/CD para a galera daora";
	}

}
