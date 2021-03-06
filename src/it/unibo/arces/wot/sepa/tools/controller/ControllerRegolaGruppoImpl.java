package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.RegolaGruppo;

public class ControllerRegolaGruppoImpl 
	extends ControllerRegolaImpl<RegolaGruppo> 
	implements ControllerRegolaGruppo {

	public ControllerRegolaGruppoImpl(RegolaGruppo regola, Acl acl) {
		super(regola, acl);
	}

	@Override
	public void inserisciGroupWebId(String groupWebId) {
		this.regola.setGruppoWebId(groupWebId);
	}

}
