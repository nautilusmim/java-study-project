package org.it315.custom.tag;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class DisplayUserInfoTag extends TagSupport {

	private static final long serialVersionUID = -182097468419801767L;
	
	@Override
	public int doStartTag() throws JspException {
		HttpSession session = pageContext.getSession();
		Object user = session.getAttribute("user");
		if(null == user) {
			return super.doStartTag();
		} else {
			return EVAL_BODY_INCLUDE;
		}
	}

}
