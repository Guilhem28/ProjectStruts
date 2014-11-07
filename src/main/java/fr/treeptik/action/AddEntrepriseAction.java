package fr.treeptik.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.pojo.Entreprise;
import fr.treeptik.service.EntrepriseService;

@Action(value="addEntrepriseAction", results = { 
		@Result(name="success", type = "redirectAction", location="/index.action"), 
		@Result(name = "input", location = "/entreprise/addEntreprise.jsp")
		})
public class AddEntrepriseAction extends ActionSupport implements ModelDriven<Entreprise> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Entreprise entreprise = new Entreprise();
	
	@Autowired
	private EntrepriseService entrepriseService;
	
	@Override
	public Entreprise getModel() {
		return entreprise;
	}

	@Override
	public String execute() throws Exception {	
		
		System.out.println("ADD ENTREPRISE: " + entreprise);
		entrepriseService.add(entreprise);	
		return "success";
	}
}
