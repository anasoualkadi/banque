package com.formation.banque.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	@Id
	@GeneratedValue
	private Long id;

	private Long codeEmploye;

	private String nomEmploye;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_superieur_hierarchique")
	private Employe supHierarchique;
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "employes")
    private Set<Groupe> groupes = new HashSet<>();
	

	public Employe() {
		super();
	}

	public Employe(Long codeEmploye, String nomEmploye) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
	}
	
	public Employe(Long codeEmploye, String nomEmploye, Employe supHierarchique) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
		this.supHierarchique = supHierarchique;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public Employe getSupHierarchique() {
		return supHierarchique;
	}

	public void setSupHierarchique(Employe supHierarchique) {
		this.supHierarchique = supHierarchique;
	}

}
