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
		// em.getTransaction().commit(); // a verifier mais je crois qu on doit commit quand on ajoute une donnee.
		
		return c;
	}


    public void removeColis(long id){
		Colis c = em.find(Colis.class, id);
		em.remove(c);
		em.getTransaction().commit();
    }
}
