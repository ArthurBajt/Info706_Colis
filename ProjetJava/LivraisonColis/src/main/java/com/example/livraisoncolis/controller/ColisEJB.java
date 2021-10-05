package com.example.livraisoncolis.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Position;

public class ColisEJB {

	@PersistenceContext
	private EntityManager em; 
	
	
	public ColisEJB() {
	}
	
	public Colis addColis(long id, double poid, double valeur, String origine, String destination, Position achemeniment) {
		Colis c = new Colis(id, poid, valeur, origine, destination, achemeniment);
		em.persist(c);
		
		return c;
		
	}
}
