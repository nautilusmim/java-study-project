package com.action;

import java.util.List;
import java.util.Map;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class TypeConvertAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<User> users;
	
	private Map<String, User> userMaps;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Map<String, User> getUserMaps() {
		return userMaps;
	}

	public void setUserMaps(Map<String, User> userMaps) {
		this.userMaps = userMaps;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
