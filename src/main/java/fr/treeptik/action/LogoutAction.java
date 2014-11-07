package fr.treeptik.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.pojo.User;

@Action(value = "logout", results = { @Result(name = "success", location = "/login.jsp"), })
public class LogoutAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user = new User();

	private Map<String, Object> session;

	@Override
	public String execute() throws Exception {

		System.out.println("logOut");

		if (session instanceof org.apache.struts2.dispatcher.SessionMap) {
			try {
				((org.apache.struts2.dispatcher.SessionMap) session)
						.invalidate();
			} catch (IllegalStateException e) {
				e.toString();
			}
		}

		return "success";
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
