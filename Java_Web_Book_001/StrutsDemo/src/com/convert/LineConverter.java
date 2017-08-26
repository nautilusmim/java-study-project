package com.convert;

import java.util.Map;

import com.model.Line;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class LineConverter extends DefaultTypeConverter {
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		if(toType == Line.class) {
			String[] params = (String[])value;
			String param = params[0];
			
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
		} else if(toType == String.class) { //Convert Class instance line to Class String
			Line line  = (Line)value;
			return (Object)("(" + line.getX1() + "," + line.getY1() + "," + line.getX2() + "," + line.getY2() + ")");
		}
		
		return null;
	}
	
}
