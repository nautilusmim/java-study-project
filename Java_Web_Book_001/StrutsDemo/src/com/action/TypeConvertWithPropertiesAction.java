package com.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("rawtypes")
public class TypeConvertWithPropertiesAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private List users;
	
	private Map userMaps;

	public List getUsers() {
		return users;
	}

	public void setUsers(List users) {
		this.users = users;
	}
	
	public Map getUserMaps() {
		return userMaps;
	}

	public void setUserMaps(Map userMaps) {
		this.userMaps = userMaps;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
