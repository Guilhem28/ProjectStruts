package fr.treeptik.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.pojo.Contact;
import fr.treeptik.pojo.Entreprise;
import fr.treeptik.service.ContactService;


@Action(value="addContactAction", results = { 
		@Result(name="success", type = "redirectAction", location="index.action"), 
		@Result(name = "input", location = "/contact/add.jsp")
		})
public class AddContactAction extends ActionSupport implements ModelDriven<Contact>{

	/**
	 * 	
	 */
	private static final long serialVersionUID = 1L;

	private Contact contact = new Contact();
	
	@Autowired
	private ContactService contactService;
	
	@Override
	public Contact getModel() {
		return contact;
	}
	
	private Integer idEntreprise;

	@Override
	public String execute() throws Exception {	
		
		System.out.println("ADD Contact: " + contact);
		
		Entreprise entreprise = new Entreprise();
		entreprise.setId(idEntreprise);
		
		contact.setEntreprise(entreprise);
		contactService.add(contact);	
		return "success";
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

}
