package it.unibo.arces.wot.sepa.tools.controller;

import it.unibo.arces.wot.sepa.tools.model.TipoDiPermesso;

public interface ControllerRegola {

	void inserisciPermesso(TipoDiPermesso permesso);
	void rimuoviPermesso(TipoDiPermesso permesso);
    void eliminaRegola();
}

