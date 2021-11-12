package com.example.livraisoncolis.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.Query;

import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Etat;
import com.example.livraisoncolis.model.Position;

import java.util.List;

@Stateless
public class ColisEJB {

	@PersistenceContext
	private EntityManager em; 
	
	
	public ColisEJB() {
	}
	
	public Colis addColis(double poid, double valeur, String origine, String destination, Position acheminement) {
		Colis c = new Colis(poid, valeur, origine, destination, acheminement);
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
    
    public Colis updateColis(long id, double latitude, double longitude, String emplacement, Etat etat) {
		Colis c = em.find(Colis.class, id);
		c.getAcheminement().setLatitude(latitude);
		c.getAcheminement().setLongitude(longitude);
		c.getAcheminement().setEmplacement(emplacement);
		c.getAcheminement().setEtat(etat);
		em.merge(c);
		return c;
    }
    
    
}
