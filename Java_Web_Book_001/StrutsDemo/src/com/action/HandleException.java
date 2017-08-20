package com.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class HandleException extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5384356990650980603L;
	
	private String name;
	private String age;
	private String telephone;
	
	private String hello;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	@Override
	public String execute() throws Exception {
		if(!getName().equals("tom")) {
			throw new SecurityException("wrong name!!!!!");
		} else if(!getAge().equals("20")) {
			throw new Exception("wrong age!!!!!");
		} else if(!getTelephone().equals("120")) {
			throw new SQLException();
		} else {
			hello = "success, hello, haha!";
			return super.execute();
		}
	}
	
}
