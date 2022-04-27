package com.ut.util;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.ut.util.impl.StringUtilImpl;

public class StringUtilTest {
	
	@Test
	public void testGenerateRanbomString() {
		StringUtil stringUtil = new StringUtilImpl();
		
		String randomString = stringUtil.generateRanbomString();
		
		assertEquals(100, randomString.length());
	}

}
