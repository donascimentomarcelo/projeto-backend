package br.com.projeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dto.Dto;
import br.com.projeto.dto.FormDto;
import br.com.projeto.services.ProjetoService;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {
	
	@Autowired
	private ProjetoService projetoService;

	@PostMapping
	ResponseEntity<?> postForm(@RequestBody FormDto form) {
		
		Dto dto = projetoService.formatDto(form);
		projetoService.sendToEndpoint(dto);
		  
		return ResponseEntity.ok().build();
	}
}
