package com.action;

import com.model.Line;
import com.opensymphony.xwork2.ActionSupport;

public class LineTypeConvertAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Line line;

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}
	
	@Override
	public String execute() throws Exception {
		return super.execute();
	}

}
