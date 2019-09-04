package org.it315.custom.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TestMemoryTag extends TagSupport {

	private static final long serialVersionUID = -5918588900622279888L;
	
	private static int number = 0; // number of created instance
	private int mynum = 0; // id of instance
	private int count = 0; // times of tag invoked
	
	public TestMemoryTag() {
		mynum = ++number;
	}
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.println("This is the " + mynum + " tag instance, execute " + (++count) + " times.");
			Thread.sleep(5000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
	@Override
	public void release() {
		super.release();
		System.out.println("NO." + mynum + " has been released.");
	}

}
