package com.fundatec.lp3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundatec.lp3.model.Pessoa;
import com.fundatec.lp3.repository.PessoaRepository;
import com.fundatec.lp3.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	PessoaRepository pessoaRepository;
	
	PessoaService pessoaService;

	@Autowired
	public PessoaController(PessoaRepository pessoaRepository, PessoaService pessoaService) {
		this.pessoaRepository = pessoaRepository;
		this.pessoaService = pessoaService;
		
	}

	@GetMapping
	public ResponseEntity<List<Pessoa>> listar() {
		List<Pessoa> pessoas = pessoaService.listarPessoas();
		return ResponseEntity.ok(pessoas);

	}

	@PostMapping
	public ResponseEntity<Pessoa> adicionarPessoa(@RequestBody Pessoa pessoa) {
		Pessoa pessoaPersistida = pessoaService.salvarPessoa(pessoa);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaPersistida);

	}

	@DeleteMapping
	public ResponseEntity<Void> deletarPessoas() {
		pessoaService.deletarPessoas();
		return ResponseEntity.noContent().build();

	}

}
