package com.example.livraisoncolis.model;

import java.io.Serializable;

public class Position implements Serializable {

	double latitude;
	double longitude;
	String emplacement;
	Etat etat;
	
	public Position(double lat, double longi, String emp) {
		this.latitude=lat;
		this.longitude=longi;
		this.emplacement=emp;
		this.etat=Etat.ENREGISTREMENT;
		
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
