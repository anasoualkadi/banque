package com.formation.banque.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Long numOperation, Date dateOperation, Double montant) {
		super(numOperation, dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

}
