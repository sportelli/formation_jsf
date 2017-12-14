package fr.formation.view.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@ManagedBean
@RequestScoped
public class Page5Bean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Size(min=1, message="Nom obligatoire")
	private String nom;
	
	@Size(min=1, message="Prenom obligatoire")
	private String prenom;
	
	@Pattern(regexp="^[a-zA-Z0-9]+@[a-zA-Z0-9]+.com$",message="Email non valide")
	private String email;
	
	@NotNull(message="Age obligatoire")
	@Min(value=18, message="Nous n'acceptons que les majeurs")
	private Integer age;

	public void nouveau() {
		System.out.println("nouveau !");
	}
	
	public Page5Bean() {
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
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
