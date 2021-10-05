package com.example.livraisoncolis.model;

public class Colis {

    private long id;
    private double poid;
    private double valeur;
    private Position origine;
    private Position destination;

//    Constructors
    public Colis(long id, double poid, double valeur, Position origine, Position destination){
        this.id = id;
        this.poid = poid;
        this.valeur = valeur;
        this.origine = origine;
        this.destination = destination;
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

    public Position getOrigine() {
        return origine;
    }

    public Position getDestination() {
        return destination;
    }

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
                ", destination=" + this.destination.toString() +
                '}';
    }
}
