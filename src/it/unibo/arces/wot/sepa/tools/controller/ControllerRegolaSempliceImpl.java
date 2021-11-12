package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.RegolaSemplice;

public class ControllerRegolaSempliceImpl
	extends ControllerRegolaImpl<RegolaSemplice>
	implements ControllerRegolaSemplice  {

	public ControllerRegolaSempliceImpl(RegolaSemplice regola, Acl acl) { //qui il generico diventa specifico 
		super(regola, acl);                                               //di regola Semplice
	}

	@Override
	public void inserisciUserWebId(String userWebId) {
		this.regola.setUserWebId(userWebId);
	}
}