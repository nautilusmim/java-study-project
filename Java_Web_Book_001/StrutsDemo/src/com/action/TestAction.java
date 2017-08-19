package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7178554731510658820L;
	
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	@Override
	public String execute() throws Exception {
		hello = "Hello, World!";
		
		return super.execute(); // == return SUCCESS;
	}

}
