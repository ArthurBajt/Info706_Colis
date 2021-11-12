package com.example.livraisoncolis.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Position;

import java.util.List;

@Stateless
public class ColisEJB {

	@PersistenceContext
	private EntityManager em; 
	
	
	public ColisEJB() {
	}
	
	public Colis addColis(double poid, double valeur, String origine, String destination, Position pos) {
		Colis c = new Colis(poid, valeur, origine, destination, pos);
		em.persist(c);
		
		return c;
	}


	public Colis findColis(long id){
		Colis c = em.find(Colis.class, id);
		return c;
	}


	public List<Colis> findAllColis(){
		Query query = em.createQuery("SELECT e FROM Colis e");
		return query.getResultList();
	}

	
    public void removeColis(long id){
		Colis c = em.find(Colis.class, id);
		em.remove(c);
    }
    
    
}
