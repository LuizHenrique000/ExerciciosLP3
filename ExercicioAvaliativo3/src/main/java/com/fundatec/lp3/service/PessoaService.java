package com.fundatec.lp3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundatec.lp3.model.Pessoa;
import com.fundatec.lp3.repository.PessoaRepository;

@Service
public class PessoaService {
	
	private PessoaRepository pessoaRepository;
	
	@Autowired
	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}	
	
	//Primeira regra
	//A metodo possui apenas uma responsabilidade 
	
	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}
	
	public Pessoa salvarPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public void deletarPessoas() {
		pessoaRepository.deleteAll();
	}

}
