package org.it315.custom.tag;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ValidateTag extends TagSupport {

	private static final long serialVersionUID = -5788659473079046246L;
	
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("Executed");
		
		JspWriter out = pageContext.getOut();
		
		HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
		String host = req.getServerName();
		String referer = req.getHeader("Referer");
		System.out.println(referer);
		
		if(null == referer || !referer.contains(host)) {
			try {
				if(null == url) {
					out.print("不是本服务页面提供的跳转，请使用合法页面！");
				} else {
					pageContext.forward(url);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
			return SKIP_PAGE;
		} else {
			return EVAL_PAGE;
		}
	}

}
