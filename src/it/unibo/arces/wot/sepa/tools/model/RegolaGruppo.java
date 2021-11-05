package it.unibo.arces.wot.sepa.tools.model;

public class RegolaGruppo extends Regola {

	private String gruppoWebId;
	
	public RegolaGruppo( String gruppoWebId) { //costruttore-figlio con costruttore padre di default 
		this.gruppoWebId = gruppoWebId;
		
	}
	
	public String getGruppoWebId(){              //metodo per avere il WebId del gruppo
		return this.gruppoWebId;
	}
	
	public void setGruppoWebId(String gruppoWebId){   //metodo per modificare il Web ID del gruppo 
		this.gruppoWebId = gruppoWebId;
	}
	
	
}
