package org.it315.custom.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class TestBodyTag extends BodyTagSupport {

	private static final long serialVersionUID = -8202979362175707480L;
	
	@Override
	public int doEndTag() throws JspException {
		String content = bodyContent.getString();
		
		content = "<a href='" + content + "'>" + content + "</a>";
		
		JspWriter out = bodyContent.getEnclosingWriter();
		try {
			out.print(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doEndTag();
	}

}
