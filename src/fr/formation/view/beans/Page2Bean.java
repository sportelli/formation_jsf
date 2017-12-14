package fr.formation.view.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.formation.view.model.Utilisateur;

@ManagedBean
@RequestScoped
public class Page2Bean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nom;
	private Utilisateur user;
	
	public Page2Bean() {
		super();
		this.nom = "felix";
		this.user = new Utilisateur();
		this.user.setId(1);
		this.user.setPrenom("Felix");
		this.user.setNom("SPORTELLI");
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}	
}
