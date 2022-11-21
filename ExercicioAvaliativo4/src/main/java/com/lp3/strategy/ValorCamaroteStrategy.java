package com.lp3.strategy;

import java.math.BigDecimal;
import com.lp3.model.Ingresso;
import com.lp3.model.Usuario;

public class ValorCamaroteStrategy implements ValorIngressoStrategy{

	@Override
	public BigDecimal calcularValor(Ingresso ingresso, Usuario usuario) {
		return ingresso.getValor(); 

	}

	@Override
	public boolean isIdoso(Usuario usuario) {
		return false;
	}

}

	


