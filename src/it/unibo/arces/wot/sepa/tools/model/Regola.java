package it.unibo.arces.wot.sepa.tools.model;

import java.util.HashSet;
import java.util.Set;

public abstract class Regola {   //abstract perchè non crea nuove istanze ma solo dei figli

	private Set<TipoDiPermesso> permessi = new HashSet<>();        //insieme dei permessi
	
	
	public void aggiungiPermesso (TipoDiPermesso permesso) { //metodo che aggiunge il permesso
		this.permessi.add( permesso );
		
	}
	
	public void eliminaPermesso (TipoDiPermesso permesso) { //metodo che elimina il permesso
		this.permessi.remove( permesso );
		
	}
	
}
