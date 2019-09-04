package org.it315.custom.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class IterateTag extends TagSupport {

	private static final long serialVersionUID = -3358086024347216429L;
	
	private String name;
	
	private String[] items;
	
	private int i;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}
	
	@Override
	public int doStartTag() throws JspException {
		i = 0;
		
		if(null == items || items.length <= 0) {
			return SKIP_BODY;
		} else {
			pageContext.setAttribute(name, items[0]);
			return EVAL_BODY_INCLUDE;
		}
	}
	
	@Override
	public int doAfterBody() throws JspException {
		if(++i < items.length) {
			pageContext.setAttribute(name, items[i]);
			return EVAL_BODY_AGAIN;
		} else {
			return SKIP_BODY;
		}
	}

}
