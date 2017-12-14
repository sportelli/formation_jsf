package fr.formation.view.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Page4Bean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	
	public Page4Bean() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String go() {
		return "page4";
	}
	
}
