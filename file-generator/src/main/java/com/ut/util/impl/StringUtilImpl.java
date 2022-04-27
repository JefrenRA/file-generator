package com.ut.util.impl;

import com.ut.util.StringUtil;

public class StringUtilImpl implements StringUtil {
	
	@Override
	public String generateRanbomString() {
		
		String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 100; i++) {
			int index = (int) (alphaString.length() * Math.random());
			
			sb.append(alphaString.charAt(index));
		}
		
		return sb.toString();
	}

}
