package com.lp3.model;

import java.time.LocalDateTime;
import java.util.List;
import lombok.ToString;

@ToString
public class Evento {

	private String nome;
	private LocalDateTime data;
	private int capacidade;
	private List<Ingresso> ingressos;
	
	public Evento(String nome, LocalDateTime data, int capacidade) {
		this.nome = nome;
		this.data = data;
		this.capacidade = capacidade;
	}

	public Evento(String nome, LocalDateTime data, int capacidade, List<Ingresso> ingressos) {
		this.nome = nome;
		this.data = data;
		this.capacidade = capacidade;
		this.ingressos = ingressos;
	}
	

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

}
