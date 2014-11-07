package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.pojo.Echange;
import fr.treeptik.service.EchangeService;

@Action(value = "listEchangeOfContactAction", results = { @Result(name = "success", location = "/indexEchange.jsp"), })
public class ListEchangeOfContactAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private EchangeService echangeService;

	private List<Echange> echanges = new ArrayList<>();

	private Integer idUser;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Liste d'echange pour la persone: "+idUser);

		echanges = echangeService.getListEchangeForOneContact(idUser);

		System.out.println(echanges);
		return "success";
	}
	
	public List<Echange> getEchanges() {
		return echanges;
	}

	public void setEchanges(List<Echange> echanges) {
		this.echanges = echanges;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
}
