package com.fundatec.lp3.models;

public abstract class Card {

	private String nome;
	private String tipo;
	private String efeito;
	private String descricao;

	public Card(String nome, String tipo, String efeito, String descricao) {
		this.nome = nome;
		this.tipo = tipo;
		this.efeito = efeito;
		this.descricao = descricao;
	}

	public abstract void exibirLogDeRegistro();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEfeito() {
		return efeito;
	}

	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Card [nome=" + nome + ", tipo=" + tipo + ", efeito=" + efeito + ", descricao=" + descricao + "]";
	}

}
