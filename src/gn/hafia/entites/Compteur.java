package gn.hafia.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Compteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String numeroCompteur;
	@OneToMany(mappedBy = "compteur")
	private List<Facture> facture = new ArrayList<Facture>();

	public Compteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compteur(int id, String numeroCompteur, List<Facture> facture) {
		super();
		this.id = id;
		this.numeroCompteur = numeroCompteur;
		this.facture = facture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroCompteur() {
		return numeroCompteur;
	}

	public void setNumeroCompteur(String numeroCompteur) {
		this.numeroCompteur = numeroCompteur;
	}

	public List<Facture> getFacture() {
		return facture;
	}

	public void setFacture(List<Facture> facture) {
		this.facture = facture;
	}
	
	
}
