package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Echange implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String type;
	private Date date;
	private String commentaire;

	@ManyToOne
	private Contact contact;
	
	public Echange() {
		super();
	}

	public Echange(String type, Date date, String commentaire) {
		super();
		this.type = type;
		this.date = date;
		this.commentaire = commentaire;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Echange [id=" + id + ", type=" + type + ", date=" + date
				+ ", commentaire=" + commentaire + ", contact=" + contact + "]";
	}
	

}
