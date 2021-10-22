package com.example.livraisoncolis.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Position;

@Stateless
@LocalBean
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


    public void removeColis(long id){
		Colis c = em.find(Colis.class, id);
		em.remove(c);
    }
}
