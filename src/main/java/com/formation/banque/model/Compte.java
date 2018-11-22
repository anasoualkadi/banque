package com.formation.banque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "compte_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Compte {

	@Id
	@GeneratedValue
	private Long id;

	private String numCompte;

	@Temporal(TemporalType.DATE)
	private Date dateOperation;

	private Double solde;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Operation> operations = new ArrayList<>();

	@ManyToOne(cascade = CascadeType.ALL)
	private Client client;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employe employe;

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Compte() {

	}

	public Compte(String numCompte, Date dateOperation, Double solde) {
		super();
		this.numCompte = numCompte;
		this.dateOperation = dateOperation;
		this.solde = solde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

}
