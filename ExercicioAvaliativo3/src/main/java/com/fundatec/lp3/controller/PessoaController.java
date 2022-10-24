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
import com.fundatec.lp3.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	private PessoaService pessoaService;

	//Segunda regra
	//Utilizei aqui a injeção de dependências para tornar o codigo desacoplado
	
	@Autowired
	public PessoaController(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
		
	}
	
	//Terceira regra
	//O nome do método é bem claro
	//Não especifiquei o que o metodo lista no nome porque o 
	//retorno do próprio e a service reforçam isso 

	@GetMapping
	public ResponseEntity<List<Pessoa>> listar() {
		List<Pessoa> pessoas = pessoaService.listarPessoas();
		return ResponseEntity.ok(pessoas);

	}
	
	//Quarta regra
	//O metodo adicionarPessoa só requer um parâmetro

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
	
	//Quinta regra
	//Padronizei o retorno de ambos os metodos para que sigam um padrão
	//No caso o retorno de ambos é uma ResponseEntity

}
