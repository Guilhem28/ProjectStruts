package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.pojo.Entreprise;
import fr.treeptik.service.EntrepriseService;

@Action(value = "entrepriseAction", results = { @Result(name = "success", location = "/indexEntreprise.jsp"), })
public class IndexEntrepriseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private EntrepriseService entrepriseService;

	private List<Entreprise> entreprises = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		entreprises = entrepriseService.getAll();

		System.out.println(entreprises);
		return "success";
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

}
