package com.fundatec.lp3.models;

import com.fundatec.lp3.enums.TipoArmadilha;

public class CardArmadilha extends Card {
	
	private TipoArmadilha tipoArmadilha;

	public CardArmadilha(String nome, String tipo, String efeito, String descricao, TipoArmadilha tipoArmadilha) {
		super(nome, tipo, efeito, descricao);
		this.tipoArmadilha = tipoArmadilha;
	}

	public TipoArmadilha getTipoArmadilha() {
		return tipoArmadilha;
	}

	public void setTipoArmadilha(TipoArmadilha tipoArmadilha) {
		this.tipoArmadilha = tipoArmadilha;
	}

	@Override
	public String toString() {
		return "CardArmadilha [tipoArmadilha=" + tipoArmadilha + "]";
	}

	@Override
	public void exibirLogDeRegistro() {
		System.out.println("\nCard de Armadilha registrado: " + getNome() + "\nEfeito: " + getEfeito() + "\nDescrição: " + getDescricao());
		
	}
	
}
