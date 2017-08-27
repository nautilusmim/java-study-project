package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class InternationalAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private int age;
	
	private String tel;
	
	private String addr;
	
	private String i18nText;
	
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

	public String getI18nText() {
		return i18nText;
	}

	public void setI18nText(String i18nText) {
		this.i18nText = i18nText;
	}

	@Override
	public String execute() throws Exception {
		return super.execute();
	}

}
