package com.lp3.model;

import java.time.LocalDate;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Pessoa {

	private String nome;
	private LocalDate nascimento;
	private boolean isEstudante;
	private String documento;

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public boolean isEstudante() {
		return isEstudante;
	}

	public void setEstudante(boolean isEstudante) {
		this.isEstudante = isEstudante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
