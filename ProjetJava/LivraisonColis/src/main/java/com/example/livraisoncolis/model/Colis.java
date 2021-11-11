package com.example.livraisoncolis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Colis implements Serializable {

	
	@Id @GeneratedValue
	private long id;
	
    private double poid;
    private double valeur;
    private String origine;
    private String destination;
    //private Position acheminement;

//    Constructors
    
    public Colis() {
    	super();

    }
    
    public Colis(double poid, double valeur, String origine, String destination){
    	super();
        this.poid = poid;
        this.valeur = valeur;
        this.origine = origine;
        this.destination = destination;
        //this.acheminement = acheminement;
    }


//    Methods
    // Todo





	//    Getters
    public long getId() {
        return this.id;
    }

    public double getPoid() {
        return this.poid;
    }

    public double getValeur() {
        return this.valeur;
    }

    public String getOrigine() {
        return origine;
    }

    public String getDestination() {
        return destination;
    }

   /* public Position getAcheminement() {
		return acheminement;
	}*/
    
    //    Setters
    // ...



//    Other
    @Override
    public String toString() {
        return "Colis{" +
                "id=" + this.id +
                ", poid=" + this.poid +
                ", valeur=" + this.valeur +
                ", origine=" + this.origine.toString() +
                '}';
    }
}
