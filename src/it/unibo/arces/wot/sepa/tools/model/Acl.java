package it.unibo.arces.wot.sepa.tools.model;

import java.util.List;

public interface Acl {
	String getRisorsa();
	
	void setRisorsa(String risorsa);
	
	void aggiungiRegola(Regola regolaDaAggiungere);
	
	void eliminaRegola(Regola regolaDaEliminare);
	
	List<Regola> getListaRegole();
}
