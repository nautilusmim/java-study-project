package org.it315.custom.tag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ReadFileTag extends TagSupport {

	private static final long serialVersionUID = 1565804360315526223L;
	
	private String src;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		InputStream in = pageContext.getServletContext().getResourceAsStream(src);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		try {
			String line = null;
			while(null != (line = br.readLine())) {
				out.write(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}
	
	

}
