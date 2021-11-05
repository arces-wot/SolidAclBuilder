package it.unibo.arces.wot.sepa.tools.model;

public class RegolaSemplice extends Regola {

	private String userWebId;
	
	public RegolaSemplice( String userWebId) { //costruttore-figlio con costruttore padre di default 
		this.userWebId = userWebId;
		
	}
	
	public String getUserWebId(){              //metodo per avere il WebId
		return this.userWebId;
	}
	
	public void setUserWebId(String userWebId){   //metodo per modificare il Web ID
		this.userWebId = userWebId;
	}
	
}
