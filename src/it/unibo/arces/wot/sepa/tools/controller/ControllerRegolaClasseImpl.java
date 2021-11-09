package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.RegolaClasse;
import it.unibo.arces.wot.sepa.tools.model.TipoDiClasse;

public class ControllerRegolaClasseImpl
	extends ControllerRegolaImpl<RegolaClasse> 
	implements ControllerRegolaClasse {

	public ControllerRegolaClasseImpl(RegolaClasse regola, Acl acl) {
		super(regola,acl);

	}

	@Override
	public void setAgentClass(TipoDiClasse agentClass) {
		this.regola.setAgentClass(agentClass);
	}

}
