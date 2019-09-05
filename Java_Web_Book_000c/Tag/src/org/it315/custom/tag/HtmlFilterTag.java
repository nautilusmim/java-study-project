package org.it315.custom.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class HtmlFilterTag extends BodyTagSupport {

	private static final long serialVersionUID = 9048893610334246864L;
	
	@Override
	public int doEndTag() throws JspException {
		String content = bodyContent.getString();
		content = filter(content);
		
		try {
			bodyContent.getEnclosingWriter().write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doEndTag();
	}
	
	private String filter(String message) {
		if(null == message) {
			return null;
		}
		
		char[] cbuf = new char[message.length()];
		StringBuffer sb = new StringBuffer();
		message.getChars(0, message.length(), cbuf, 0);
		
		for(int i = 0; i < cbuf.length; i ++) {
			switch (cbuf[i]) {
			case '>':
				sb.append("&gt;");
				break;
			case '<':
				sb.append("&lt;");			
				break;
			case '&':
				sb.append("&amp;");
				break;
			case '"':
				sb.append("&quot;");
				break;
			case '\'':
				sb.append("&apos;");
				break;
			default:
				sb.append(cbuf[i]);
				break;
			}
		}
		
		return sb.toString();
	}

}
