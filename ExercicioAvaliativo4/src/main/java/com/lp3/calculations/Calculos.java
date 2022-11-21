package com.lp3.calculations;

import java.math.BigDecimal;
import com.lp3.model.Ingresso;
import com.lp3.model.Usuario;

public class Calculos {
	
	public BigDecimal calcularValorFinal(Ingresso ingresso, Usuario usuario ) {
		return ingresso.getTipoIngresso().getStrategy().calcularValor(ingresso, usuario);
	}

}
