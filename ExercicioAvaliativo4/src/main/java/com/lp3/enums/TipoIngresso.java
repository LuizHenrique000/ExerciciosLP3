package com.lp3.enums;

import com.lp3.strategy.ValorCadeiraInferiorStrategy;
import com.lp3.strategy.ValorCadeiraSuperiorStrategy;
import com.lp3.strategy.ValorCamaroteStrategy;
import com.lp3.strategy.ValorIngressoStrategy;
import com.lp3.strategy.ValorPistaPremiumStrategy;
import com.lp3.strategy.ValorPistaStrategy;

public enum TipoIngresso {
	
	PISTA(new ValorPistaStrategy()),
	PISTA_PREMIUM(new ValorPistaPremiumStrategy()),
	CAMAROTE(new ValorCamaroteStrategy()),
	CADEIRA_INFERIOR(new ValorCadeiraInferiorStrategy()),
	CADEIRA_SUPERIOR(new ValorCadeiraSuperiorStrategy());
	
	private TipoIngresso(ValorIngressoStrategy strategy) {  
		this.strategy = strategy;
	}
	
	private final ValorIngressoStrategy strategy;
	
	public ValorIngressoStrategy getStrategy() {
		return strategy;
	}

}