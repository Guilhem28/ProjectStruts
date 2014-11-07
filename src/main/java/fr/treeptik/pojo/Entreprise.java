package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String adresse;
	private String secteurActivite;

	@OneToMany(mappedBy = "entreprise")
	private List<Contact> contacts;

	public Entreprise() {
		super();
	}

	public Entreprise(Integer id, String adresse, String secteurActivite) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.secteurActivite = secteurActivite;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", adresse=" + adresse
				+ ", secteurActivite=" + secteurActivite + "]";
	}

}
