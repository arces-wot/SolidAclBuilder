package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.Acl;
import it.unibo.arces.wot.sepa.tools.model.RegolaSemplice;

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
		
		this.acl.aggiungiRegola( new RegolaSemplice("") );
		
	}

	@Override
	public void aggiungiRegolaGruppo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aggiungiRegolaClasse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserisciUrlRisorsa(String urlRisorsa) {
		// TODO Auto-generated method stub

	}

}
