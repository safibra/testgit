package gn.hafia.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int consommation;
	@Column
	private int etat;
	@Column
	private int mois;
	@Column
	private int annee;
	@ManyToOne  
	private Compteur compteur = new Compteur();
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(int id, int consommation, int etat, int mois, int annee, Compteur compteur) {
		super();
		this.id = id;
		this.consommation = consommation;
		this.etat = etat;
		this.mois = mois;
		this.annee = annee;
		this.compteur = compteur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConsommation() {
		return consommation;
	}
	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public Compteur getCompteur() {
		return compteur;
	}
	public void setCompteur(Compteur compteur) {
		this.compteur = compteur;
	}

	
	
}
