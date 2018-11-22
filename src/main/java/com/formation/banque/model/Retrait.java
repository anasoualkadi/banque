package com.formation.banque.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Long numOperation, Date dateOperation, Double montant) {
		super(numOperation, dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

}
