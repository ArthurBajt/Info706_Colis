package com.example.livraisoncolis.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Position;

@Stateless
public class ColisEJB {

	@PersistenceContext
	private EntityManager em; 
	
	
	public ColisEJB() {
	}
	
	public Colis addColis(double poid, double valeur, String origine, String destination) {
		Colis c = new Colis(poid, valeur, origine, destination );
		em.persist(c);
		
		return c;
	}


	public Colis findColis(long id){
		Colis c = em.find(Colis.class, id);
		return c;
	}
	
    public void removeColis(long id){
		Colis c = em.find(Colis.class, id);
		em.remove(c);
    }
    
    
}
