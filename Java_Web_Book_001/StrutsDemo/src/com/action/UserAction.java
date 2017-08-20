package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1572209882148568525L;
	
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String execute() throws Exception {
		info = "hello, world!";
		return super.execute(); // == return SUCCESS;
	}
	
	public String update() throws Exception {
		info = "updated!";
		return "update";
	}

}
