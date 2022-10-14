package com.fundatec.lp3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp3.models.Pessoa;
import com.fundatec.lp3.repository.PessoaRepository;

@Service
public class PessoaService {

	private PessoaRepository pessoaRepository;
	
	@Autowired
	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}	
	
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
		
	}
	
}
