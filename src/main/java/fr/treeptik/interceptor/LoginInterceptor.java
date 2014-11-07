package fr.treeptik.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import fr.treeptik.pojo.User;


public class LoginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		
		
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		
		User user = (User) session.get("user");
		
		if(user == null)
			return "login";
		
		return actionInvocation.invoke();
	}

}
