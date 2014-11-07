package fr.treeptik.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.service.EchangeService;


@Action(value="addEchangeAction", results = { 
		@Result(name="success", location="/echange/echange.jsp"), 
		})
public class IndexEchangeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EchangeService echangeService;
	
	private Integer idUser;
	
	@Override
	public String execute() throws Exception {	
		
		System.out.println("ADD ECHANGE iduser = " + idUser);
	
		return "success";
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
}
