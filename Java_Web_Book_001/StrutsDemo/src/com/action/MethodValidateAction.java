package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodValidateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private int age;
	
	private String tel;
	
	private String addr;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String log() throws Exception {
		System.out.println("log");
		return SUCCESS;
	}

	public void validateLog() {
		System.out.println("validateLog");
		if(tel.length() <= 0) {
			addFieldError("telError", "Tel should be inputed.");
		}
	}

	@Override
	public void validate() {
		System.out.println("validate");
		if(addr.length() < 4) {
			addFieldError("addrError", "Addr is too short.");
		}
		super.validate();
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute");
		return super.execute();
	}

}
