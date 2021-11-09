package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.RegolaSemplice;

public class ControllerRegolaSempliceImpl
	extends ControllerRegolaImpl<RegolaSemplice>
	implements ControllerRegolaSemplice  {

	public ControllerRegolaSempliceImpl(RegolaSemplice regola) {    //uìqui il generico diventa spacifico ed regola Semplice
		super(regola);
	}

	@Override
	public void inserisciUserWebId(String userWebId) {
		this.regola.setUserWebId(userWebId);
	}

	

}
