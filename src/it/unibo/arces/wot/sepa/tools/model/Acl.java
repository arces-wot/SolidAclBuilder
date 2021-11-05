package it.unibo.arces.wot.sepa.tools.model;

import java.util.ArrayList;
import java.util.List;

public class Acl {

	private String risorsa;  //campo
	private List<Regola> regole = new ArrayList<>();  //campo insieme di regole
	 
	
	public Acl (String risorsa) { //costruttore
		this.risorsa= risorsa;
	}
	
	public String getRisorsa() {  //metodo get
		return this.risorsa;
	}
	
	public void setRisorsa(String risorsa) {  //metodo set
		this.risorsa= risorsa;
	}
	
	public void aggiungiRegola(Regola regolaDaAggiungere) {  //metodo che aggiunge una regola alla lista di regole
		this.regole.add( regolaDaAggiungere );
	}
	
	public void eliminaRegola(Regola regolaDaEliminare) {  //metodo che elimina una regola alla lista di regole
		this.regole.remove( regolaDaEliminare );
	}
	
}

