package com.listaBSM.listaBSM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")
public class ListaBsmController {
@GetMapping 
public String listaBsm() {
	return "Persistência\r\n"
			+ "Mentalidade de Crescimento\r\n"
			+ "Orientação ao Futuro\r\n"
			+ "Responsabilidade Pessoal\r\n"
			+ "Trabalho em Equipe\r\n"
			+ "Comunicação\r\n"
			+ "Orientação aos Detalhes\r\n"
			+ "Proatividade";

}
}
