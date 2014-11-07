package fr.treeptik.action;

import java.text.SimpleDateFormat;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.pojo.Echange;
import fr.treeptik.service.EchangeService;


@Action(value="saveEchangeAction", results = { 
		@Result(name="success", type = "redirectAction", location="addEchangeAction.action"), 
		@Result(name = "input", location = "/echange/echange.jsp")
		})
public class AddEchangeAction extends ActionSupport implements ModelDriven<Echange>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Echange echange = new Echange();
	
	private String day;
	private String month;
	private String year;
	
	@Autowired
	private EchangeService echangeService;
	
	@Override
	public Echange getModel() {
		return echange;
	}

	
	@Override
	public String execute() throws Exception {	
			
		String strindDate = day + "/"+month+"/"+year;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = dateFormat.parse(strindDate);
		echange.setDate(date);
		
		System.out.println("ADD ECHANGE: " + echange);
		echangeService.add(echange);	
		return "success";
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}

}
