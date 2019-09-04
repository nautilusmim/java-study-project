package org.it315.custom.tag;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.TagSupport;

public class ListTag extends TagSupport implements DynamicAttributes {

	private static final long serialVersionUID = 5954853123637730120L;
	
	private String name;
	
	private Map<String, Object> map = new TreeMap<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<select name='" + name + "'>");
			out.println("<option value=''>please select ...</option>");
			for(Map.Entry<String, Object> entry : map.entrySet()) {
				out.println("<option value='" + entry.getKey() + "'>" + entry.getValue() + "</option>");
			}
			out.println("</select>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

	@Override
	public void setDynamicAttribute(String arg0, String arg1, Object arg2)
			throws JspException {
		map.put(arg1, arg2);
	}

}
