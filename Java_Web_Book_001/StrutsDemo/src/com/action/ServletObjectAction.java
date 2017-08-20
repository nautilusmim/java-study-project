/**
 * Require servlet object by class ServletActionContext
 */
package com.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ServletObjectAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2953779427669664640L;
	
	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("name", "request:thirdName");
		ServletActionContext.getRequest().getSession().setAttribute("name", "session:thirdName");
		ServletActionContext.getServletContext().setAttribute("name", "application:thirdName");
		return super.execute();
	}

}
