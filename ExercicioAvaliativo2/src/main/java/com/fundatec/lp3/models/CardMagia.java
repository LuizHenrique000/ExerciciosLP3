package com.fundatec.lp3.models;

import com.fundatec.lp3.enums.TipoMagia;

public class CardMagia extends Card {
	
	private TipoMagia tipoMagia;

	public CardMagia(String nome, String tipo, String efeito, String descricao, TipoMagia tipoMagia) {
		super(nome, tipo, efeito, descricao);
		this.tipoMagia = tipoMagia;
	}

	public TipoMagia getTipoMagia() {
		return tipoMagia;
	}

	public void setTipoMagia(TipoMagia tipoMagia) {
		this.tipoMagia = tipoMagia;
	}

	@Override
	public String toString() {
		return "CardMagia [tipoMagia=" + tipoMagia + "]";
	}

	@Override
	public void exibirLogDeRegistro() {
		System.out.println("Card de Magia registrado: " + getNome() + "\n" + getEfeito());
		
	}

}
