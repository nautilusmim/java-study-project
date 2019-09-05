package org.it315.custom.tag.extra;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

public class IterateTagExtraInfo extends TagExtraInfo {
	
	@Override
	public VariableInfo[] getVariableInfo(TagData data) {
		
		return new VariableInfo[] {
				new VariableInfo(data.getAttributeString("name"), "java.lang.String", true, VariableInfo.NESTED)
		};
	}

}
