package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6434128483294080524L;
	
	@Override
	public String execute() throws Exception {
		return super.execute(); // === return SUCCESS:
	}
	
	public String redirect() throws Exception {
		return ERROR;
	}

}
