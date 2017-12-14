package fr.formation.view.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@ManagedBean
//@RequestScoped // Portée des variables : Durée de vie = LA requête
@SessionScoped
public class Page6Bean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer nbVisiteurs = 0;
	
	public Page6Bean() {
		super();
	}
	
	public void ajoute() {
		this.nbVisiteurs++;
	}

	public Integer getNbVisiteurs() {
		return nbVisiteurs;
	}

	public void setNbVisiteurs(Integer nbVisiteurs) {
		this.nbVisiteurs = nbVisiteurs;
	}
	
}
