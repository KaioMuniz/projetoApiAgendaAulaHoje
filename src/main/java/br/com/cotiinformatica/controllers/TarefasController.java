package br.com.cotiinformatica.controllers;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tarefas")
public class TarefasController {

	@PostMapping
	public ResponseEntity<?> post() {
		return ResponseEntity.ok("Cadastro realizado com sucesso!");
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> put(@PathVariable UUID id) {
		return ResponseEntity.ok("Edição realizado com sucesso!");
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable UUID id) {
		return ResponseEntity.ok("Exclusão realizado com sucesso!");
	}
	
	@GetMapping()
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok("Consulta realizado com sucesso!");
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getById(@PathVariable UUID id) {
		return ResponseEntity.ok("Consulta por ID realizado com sucesso!");
	}
}
