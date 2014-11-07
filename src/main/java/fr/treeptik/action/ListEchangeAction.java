package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.pojo.Echange;
import fr.treeptik.service.EchangeService;

@Action(value = "echange", results = { @Result(name = "success", location = "/indexEchange.jsp"), })
public class ListEchangeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private EchangeService echangeService;

	private List<Echange> echanges = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		echanges = echangeService.getAll();

		System.out.println(echanges);
		return "success";
	}

	public List<Echange> getEchanges() {
		return echanges;
	}

	public void setEchanges(List<Echange> echanges) {
		this.echanges = echanges;
	}

}
