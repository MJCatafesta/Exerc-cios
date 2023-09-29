package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	@GetMapping
	public String Objetivo() {
		return "1-Aprender SQL\r\n"
				+ "2- Continuar estudando o que aprendi de Java\r\n"
				+ "3- Saber qual mais me interessa, back ou front end?";
	}

}
