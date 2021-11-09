package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.RegolaClasse;
import it.unibo.arces.wot.sepa.tools.model.TipoDiClasse;

public class ControllerRegolaClasseImpl
	extends ControllerRegolaImpl<RegolaClasse> 
	implements ControllerRegolaClasse {

	public ControllerRegolaClasseImpl(RegolaClasse regola) {
		super(regola);

	}

	@Override
	public void setAgentClass(TipoDiClasse agentClass) {
		this.regola.setAgentClass(agentClass);
	}

}
