package com.fundatec.lp3.models;

public class CardMonstro extends Card {

	private String nivel;
	private String ataque;
	private String defesa;

	public CardMonstro(String nome, String tipo, String efeito, String descricao, String nivel, String ataque,
			String defesa) {
		super(nome, tipo, efeito, descricao);
		this.nivel = nivel;
		this.ataque = ataque;
		this.defesa = defesa;
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

	@Override
	public String toString() {
		return "CardMonstro [nivel=" + nivel + ", ataque=" + ataque + ", defesa=" + defesa + ", descricao=" + getDescricao() + "]";
	}

	@Override
	public void exibirLogDeRegistro() {
		System.out.println("Card de Monstro registrado: " + getNome() + "\n" + getEfeito() + "\n" + getDescricao());
	
	}

}
