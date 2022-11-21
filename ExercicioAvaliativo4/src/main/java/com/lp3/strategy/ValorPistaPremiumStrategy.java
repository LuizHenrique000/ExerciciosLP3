package com.lp3.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import com.lp3.model.Ingresso;
import com.lp3.model.Usuario;

public class ValorPistaPremiumStrategy implements ValorIngressoStrategy {

	@Override
	public BigDecimal calcularValor(Ingresso ingresso, Usuario usuario) {
		if (isIdoso(usuario) == true) {
			return calcularComDesconto(ingresso);

		}
		if (isEstudante(usuario) == true) {
			return calcularComDesconto(ingresso);
		}

		return ingresso.getValor();

	}

	@Override
	public boolean isIdoso(Usuario usuario) {
		LocalDate anoAtual = LocalDate.now();
		LocalDate nascimento = usuario.getNascimento();
		Period periodo = Period.between(nascimento, anoAtual);
		int senioridade = 60;
		if (periodo.getYears() >= senioridade) {
			return true;
		} else {
			return false;
		}

	}

	private boolean isEstudante(Usuario usuario) {
		if (usuario.isEstudante() == true) {
			return true;
		} else {
			return false;
		}
	}

	private BigDecimal calcularComDesconto(Ingresso ingresso) {
		BigDecimal valorAtual = ingresso.getValor();
		BigDecimal porcentagem = new BigDecimal(0.5);
		BigDecimal valorDoDesconto = valorAtual.multiply(porcentagem);
		BigDecimal valorAtualizado = valorAtual.subtract(valorDoDesconto);
		return valorAtualizado;
	}

}
