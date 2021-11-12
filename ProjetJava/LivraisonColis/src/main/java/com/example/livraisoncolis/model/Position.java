package com.example.livraisoncolis.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Position implements Serializable {

	double latitude;
	double longitude;
	String emplacement;
	Etat etat;
	
	public Position(double lat, double longi, String emp) {
		super();
		this.latitude=lat;
		this.longitude=longi;
		this.emplacement=emp;
		this.etat=Etat.ENREGISTREMENT;
	}

	public Position(){
		super();
	}

	
	
	@Override
	public String toString() {
		return "Position [latitude=" + latitude + ", longitude=" + longitude + ", emplacement=" + emplacement
				+ ", etat=" + etat + "]";
	}



	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	
}
