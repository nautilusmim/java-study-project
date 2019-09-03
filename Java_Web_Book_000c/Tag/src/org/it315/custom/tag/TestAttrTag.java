package org.it315.custom.tag;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TestAttrTag extends TagSupport {

	private static final long serialVersionUID = 1121282486293146571L;
	
	private Date attr;
	
	public Date getAttr() {
		return attr;
	}

	public void setAttr(Date attr) {
		this.attr = attr;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print(DateFormat.getInstance().format(attr));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
