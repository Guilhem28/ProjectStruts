package fr.treeptik.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.pojo.User;
import fr.treeptik.service.UserService;

@Action(value = "login", results = {
		@Result(name = "success", type = "redirectAction", location = "index.action"),
		@Result(name = "input", location = "/login.jsp") })
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user = new User();
	
	@Autowired
	private UserService userService;

	private Map<String, Object> session;

	@Override
	public String execute() throws Exception {

		user = userService.getOneByNamePassword(user.getName(), user.getPassword());
		
		if(user != null)
		{
			session.put("user", user);
		}
		else
		{
			return "input";
		}
		
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
