package com.formation.banque.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

	private Double decouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String numCompte, Date dateOperation, Double solde, Double decouvert) {
		super(numCompte, dateOperation, solde);
		this.decouvert = decouvert;
	}

	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

	
}
