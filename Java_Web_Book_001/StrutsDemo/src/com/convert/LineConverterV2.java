package com.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.model.Line;

@SuppressWarnings("rawtypes")
public class LineConverterV2 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		String param = arg1[0];
		
		byte noOfComma = 0;
		StringBuilder tmpStr = new StringBuilder();
		
		Line line = new Line();
		for (int i = 0; i < param.length(); i++) {
			char ch = param.charAt(i);
			
			if(ch != ',' && ch != '(' && ch != ')') {
				tmpStr.append(ch);
			} else if(',' == ch || ')' == ch){
				noOfComma ++;
				
				switch (noOfComma) {
				case 1:
					line.setX1(Integer.valueOf(tmpStr.toString()));
					break;
				case 2:
					line.setY1(Integer.valueOf(tmpStr.toString()));
					break;
				case 3:
					line.setX2(Integer.valueOf(tmpStr.toString()));
					break;
				case 4:
					line.setY2(Integer.valueOf(tmpStr.toString()));
					break;
				}
				
				tmpStr.delete(0, tmpStr.length());
			}
			
			if(noOfComma > 4) {
				break;
			}
		}
		
		return (Object)(line);
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		Line line  = (Line)arg1;
		return "(" + line.getX1() + "," + line.getY1() + "," + line.getX2() + "," + line.getY2() + ")";
	}

}
