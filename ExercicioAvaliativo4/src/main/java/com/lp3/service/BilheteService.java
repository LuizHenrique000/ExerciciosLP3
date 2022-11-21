package com.lp3.service;

import java.math.BigDecimal;
import com.lp3.calculations.Calculos;
import com.lp3.model.Evento;
import com.lp3.model.Ingresso;
import com.lp3.model.Usuario;

public class BilheteService {

	public void comprarIngresso(Usuario usuario, Ingresso ingresso) {
		if (isDisponivel(ingresso) == false) {
			System.out.println("Capacidade Maxima Alcancada");
			return;
		}
		Calculos calculos = new Calculos();
		BigDecimal total = calculos.calcularValorFinal(ingresso, usuario);
		System.out.println(ingresso.getEvento() + "\nUsuario: " + usuario.getNome() + "\nTotal a pagar: " + total);
	}

	private boolean isDisponivel(Ingresso ingresso) {
		Evento evento = ingresso.getEvento();
		if (evento.getCapacidade() == 0) {

			return false;
		} else {
			atualizarCapacidade(ingresso);
			return true;
		}
	}

	private void atualizarCapacidade(Ingresso ingresso) {
		Evento evento = ingresso.getEvento();
		int capacidadeAtual = evento.getCapacidade();
		int capacidadeAtualizada = capacidadeAtual - 1;
		evento.setCapacidade(capacidadeAtualizada);
	}

}
