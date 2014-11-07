package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.pojo.Contact;
import fr.treeptik.service.ContactService;


@Action(value="index", results = { 
		@Result(name="success", location="/index.jsp"), 
		})
@ParentPackage("secure")
public class IndexContactAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ContactService contactService;
	
	private List<Contact> contacts = new ArrayList<>();
	
	@Override
	public String execute() throws Exception {	
		
		contacts = contactService.getAll();
		
		System.out.println(contacts);
		return "success";
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}


}
