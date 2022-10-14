package com.fundatec.lp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fundatec.lp3.models.Pessoa;
import com.fundatec.lp3.repository.PessoaRepository;
import com.fundatec.lp3.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

	@Autowired
	PessoaRepository pessoaRepository;
	
	@Autowired
	PessoaService pessoaService;
	
	@PostMapping(value = "/pessoa", method =  RequestMethod.POST)
	public ResponseEntity<Pessoa> adicionarPessoa(@RequestBody Pessoa pessoa) {
		Pessoa pessoaRegistrada = pessoaService.salvar(pessoa);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaRegistrada);
	}
	
	
}
