package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.Regola;
import it.unibo.arces.wot.sepa.tools.model.TipoDiPermesso;

public class ControllerRegolaImpl<T extends Regola> implements ControllerRegola {

	protected T regola;
	private Acl acl;
	
	public ControllerRegolaImpl(T regola, Acl acl) {
		this.acl= acl;
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

	@Override
	public void eliminaRegola() {
		
		this.acl.eliminaRegola(this.regola);
		
	}

}
