package org.it315.custom.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class UseBeanTag extends TagSupport {

	private static final long serialVersionUID = 4441129018145674763L;
	
	private String name;
	private String type;
	private String scope;
	
	private int internalScope;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public int doStartTag() throws JspException {
		if("page".equals(scope)) {
			internalScope = PageContext.PAGE_SCOPE;
		} else if("request".equals(scope)) {
			internalScope = PageContext.REQUEST_SCOPE;
		} else if("session".equals(scope)) {
			internalScope = PageContext.SESSION_SCOPE;
		} else if("application".equals(scope)) {
			internalScope = PageContext.APPLICATION_SCOPE;
		} else {
			internalScope = PageContext.PAGE_SCOPE;
		}
		
		Object obj;
		try {
			obj = Class.forName(type).newInstance();
			pageContext.setAttribute(name, obj, internalScope);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
	}

}
