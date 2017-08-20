package com.action;

import com.model.UserModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelDrivenTest extends ActionSupport implements ModelDriven<UserModel> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1401644486843312693L;
	
	private UserModel user = new UserModel();

	@Override
	public UserModel getModel() {
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		ActionContext context = ActionContext.getContext();
		context.put("user", user); // set object into request attribute
		return super.execute();
	}

}
