/**
 * Require servlet object by implements interface
 */
package com.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.Action;

public class ServletAwareAction implements Action, ServletRequestAware, ServletContextAware {
	
	private HttpServletRequest request;
	private ServletContext context;
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}
	
	@Override
	public void setServletContext(ServletContext arg0) {
		context = arg0;
	}
	
	@Override
	public String execute() throws Exception {
		request.setAttribute("name", "request:anotherName");
		request.getSession().setAttribute("name", "session:anotherName");
		context.setAttribute("name", "application:anotherName");
		return SUCCESS;
	}

}
