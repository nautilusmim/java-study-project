/**
 * Require servlet object by class ActionContext
 */
package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1972956187956044066L;

	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		
		actionContext.getApplication().put("name", "application:tom");
		actionContext.getSession().put("name", "session:tom");
		actionContext.put("name", "request:tom");
		
		return super.execute(); // == return SUCCESS;
	}

}
