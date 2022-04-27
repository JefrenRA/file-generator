package com.ut.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.ut.util.impl.FileWriterUtilImpl;

public class FileWriterUtilTest {
	
	@Test
	public void testIfIsFileGeneratedTrue() throws IOException {
		FileWriterUtil stringUtil = new FileWriterUtilImpl();
		
		Integer lineCount = 1;
		boolean test = stringUtil.isFileGenerated(lineCount);
		
		assertTrue(test);
	}
	
	@Test
	public void testIfIsFileGeneratedFalse() throws IOException {
		FileWriterUtil stringUtil = new FileWriterUtilImpl();
		
		Integer lineCount = 231;
		boolean test = stringUtil.isFileGenerated(lineCount);
		
		assertFalse(test);
	}

}
