package com.lp3.model;

import java.util.List;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Usuario extends Pessoa {

	private String login;
	private String senha;
	private List<Evento> eventos;

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	

}
