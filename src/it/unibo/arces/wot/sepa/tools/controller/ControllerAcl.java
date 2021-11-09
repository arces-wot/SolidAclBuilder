package it.unibo.arces.wot.sepa.tools.controller;

public interface ControllerAcl  {
	
	void generaAcl();
	ControllerRegolaSemplice aggiungiRegolaSemplice();
	ControllerRegolaGruppo aggiungiRegolaGruppo();
	ControllerRegolaClasse aggiungiRegolaClasse();
	void inserisciUrlRisorsa(String urlRisorsa );
	
}
