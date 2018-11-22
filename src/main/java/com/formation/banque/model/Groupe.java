package com.formation.banque.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Groupe {

	@Id
	@GeneratedValue
	private Long id;

	private Long codeEmploye;

	private String nomEmploye;

	public Groupe() {
		super();
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "groupe_employes", joinColumns = { @JoinColumn(name = "groupe_id") }, inverseJoinColumns = {
			@JoinColumn(name = "employe_id") })
	private Set<Employe> tags = new HashSet<>();

	public Groupe(Long codeEmploye, String nomEmploye) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmploye = nomEmploye;
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

	public Set<Employe> getTags() {
		return tags;
	}

	public void setTags(Set<Employe> tags) {
		this.tags = tags;
	}

}
