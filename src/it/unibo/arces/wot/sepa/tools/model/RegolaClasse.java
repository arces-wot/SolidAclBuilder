package it.unibo.arces.wot.sepa.tools.model;


public class RegolaClasse extends Regola {

	private TipoDiClasse agentClass;        //insieme dei permessi
	
	
	public void  setAgentClass ( TipoDiClasse agentClass) {
		this.agentClass= agentClass ;
		
	}
	
	public TipoDiClasse getAgentClass() {
		return this.agentClass;
	}
}
