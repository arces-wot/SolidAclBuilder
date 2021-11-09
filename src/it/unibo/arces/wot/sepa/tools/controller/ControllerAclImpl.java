package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.RegolaClasse;
import it.unibo.arces.wot.sepa.tools.model.RegolaGruppo;
import it.unibo.arces.wot.sepa.tools.model.RegolaSemplice;
import it.unibo.arces.wot.sepa.tools.model.TipoDiClasse;

public class ControllerAclImpl implements ControllerAcl {

	private Acl acl;
	
	public ControllerAclImpl( Acl acl) {
		this.acl=acl;
		
	}
	@Override
	public void generaAcl() {   //Qui serve la traduzione di Jena
		
	}

	@Override
	public ControllerRegolaSemplice aggiungiRegolaSemplice() {
		
		RegolaSemplice regola = new RegolaSemplice("");
		this.acl.aggiungiRegola(regola);
		return new ControllerRegolaSempliceImpl(regola)  ;
		
	}

	@Override
	public ControllerRegolaGruppo aggiungiRegolaGruppo() {
		RegolaGruppo regola = new RegolaGruppo("");
		this.acl.aggiungiRegola(regola);
		return new ControllerRegolaGruppoImpl(regola)  ;
			

	}

	@Override
	public ControllerRegolaClasse aggiungiRegolaClasse() {
		
		RegolaClasse regola = new RegolaClasse(TipoDiClasse.PUBBLICA);
	    this.acl.aggiungiRegola(regola);
		return new ControllerRegolaClasseImpl(regola);

	}

	@Override
	public void inserisciUrlRisorsa(String urlRisorsa) {
		
		this.acl.setRisorsa(urlRisorsa);
		
	}

}
