package com.formation.banque.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {

	private Double taux;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String numCompte, Date dateOperation, Double solde, Double taux) {
		super(numCompte, dateOperation, solde);
		this.taux = taux;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

}
