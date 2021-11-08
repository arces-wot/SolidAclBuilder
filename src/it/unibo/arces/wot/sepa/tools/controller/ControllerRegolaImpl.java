package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Regola;
import it.unibo.arces.wot.sepa.tools.model.TipoDiPermesso;

public class ControllerRegolaImpl<T extends Regola> implements ControllerRegola {

	protected T regola;
	
	public ControllerRegolaImpl(T regola) {
		this.regola = regola;
	}
	
	@Override
	public void inserisciPermesso(TipoDiPermesso permesso) {
		this.regola.aggiungiPermesso(permesso);
	}

	@Override
	public void rimuoviPermesso(TipoDiPermesso permesso) {
		this.regola.eliminaPermesso(permesso);
	}

}
