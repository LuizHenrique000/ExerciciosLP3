package com.lp3.strategy;

import java.math.BigDecimal;

import com.lp3.model.Ingresso;
import com.lp3.model.Usuario;

public interface ValorIngressoStrategy {
	
	public boolean isIdoso(Usuario usuario); 

	public BigDecimal calcularValor(Ingresso ingresso, Usuario usuario);
	
	
		
}
