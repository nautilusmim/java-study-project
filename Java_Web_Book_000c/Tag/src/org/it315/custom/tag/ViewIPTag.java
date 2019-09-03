package org.it315.custom.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ViewIPTag extends TagSupport {

	private static final long serialVersionUID = -2736280132496855807L;
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		String ip = pageContext.getRequest().getRemoteHost();
								//.getRemoteAddr()
		
		try {
			out.write(ip);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}

}
