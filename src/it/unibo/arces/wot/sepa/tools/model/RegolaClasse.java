package it.unibo.arces.wot.sepa.tools.model;

import java.util.HashSet;
import java.util.Set;

public class RegolaClasse {

private Set<TipoDiClasse> agentClass = new HashSet<>();        //insieme dei permessi
	
	
	public void Imposta (TipoDiClasse agentClass) {
		this.agentClass.add( agentClass );
		
	}
	
	public void eliminaPermesso (TipoDiClasse agentClass) {
		this.agentClass.remove( agentClass );
		
	}
}
