package com.lp3.model;

import java.math.BigDecimal;
import com.lp3.enums.TipoIngresso;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Ingresso {

	private int id;
	private Evento evento;
	private Usuario usuario;
	private BigDecimal valor;
	private TipoIngresso tipoIngresso;
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoIngresso getTipoIngresso() {
		return tipoIngresso;
	}
	public void setTipoIngresso(TipoIngresso tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	
	
}
