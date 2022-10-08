package com.fundatec.lp3.models;

import com.fundatec.lp3.enums.TipoMonstro;

public class CardMonstro extends Card {

	private String nivel;
	private String ataque;
	private String defesa;
	private TipoMonstro tipoMonstro;

	public CardMonstro(String nome, String tipo, String efeito, String descricao, String nivel, String ataque,
			String defesa, TipoMonstro tipoMonstro) {
		super(nome, tipo, efeito, descricao);
		this.nivel = nivel;
		this.ataque = ataque;
		this.defesa = defesa;
		this.tipoMonstro = tipoMonstro;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getAtaque() {
		return ataque;
	}

	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}

	public String getDefesa() {
		return defesa;
	}

	public void setDefesa(String defesa) {
		this.defesa = defesa;
	}

	public TipoMonstro getTipoMonstro() {
		return tipoMonstro;
	}

	public void setTipoMonstro(TipoMonstro tipoMonstro) {
		this.tipoMonstro = tipoMonstro;
	}

	@Override
	public String toString() {
		return "CardMonstro [nivel=" + nivel + ", ataque=" + ataque + ", defesa=" + defesa + ", tipoMonstro="
				+ tipoMonstro + "]";
	}

	@Override
	public void exibirLogDeRegistro() {
		System.out.println("\nCard de Monstro registrado: " + getNome() + "\nEfeito: " + getEfeito() + "\nDescrição: " + getDescricao());

	}

}
