package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	private String nom;
	private String prenom;
	private String mail;
	private String numeroMobile;
	private String numeroDomicile;
	private Integer status;

	/*
	private static enum StatusEnum {
		Client, Prospect, ContactDirect
	}
	*/

	@ManyToOne
	private Entreprise entreprise;

	@OneToMany(mappedBy="contact")
	private List<Echange> echanges;
	
	public Contact() {
	}

	public Contact(Integer id, String nom, String prenom, String mail,
			String numeroMobile, String numeroDomicile, Integer status) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.numeroMobile = numeroMobile;
		this.numeroDomicile = numeroDomicile;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumeroMobile() {
		return numeroMobile;
	}

	public void setNumeroMobile(String numeroMobile) {
		this.numeroMobile = numeroMobile;
	}

	public String getNumeroDomicile() {
		return numeroDomicile;
	}

	public void setNumeroDomicile(String numeroDomicile) {
		this.numeroDomicile = numeroDomicile;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {

		return "Contact [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", mail=" + mail + ", numeroMobile=" + numeroMobile
				+ ", numeroDomicile=" + numeroDomicile + ", status=" + status
				+ "]";
	}

}
