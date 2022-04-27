package com.ut.util.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.ut.util.FileWriterUtil;
import com.ut.util.StringUtil;

public class FileWriterUtilImpl implements FileWriterUtil{

	public boolean isFileGenerated(Integer lineCount) throws IOException {
		StringUtil stringUtil = new StringUtilImpl();
		BufferedWriter writer = null;
		
		if(lineCount < 1 || lineCount > 230) {
			System.out.println("Invalid line number");
			return false;
		}
		
		try {
			writer = new BufferedWriter(new FileWriter("output.txt"));
			for(int line = 1; line <= lineCount; line++) {
				writer.append(stringUtil.generateRanbomString());
				if(line < lineCount) writer.append("\n");
			}
		} catch (IOException e) {
			return false;
		} finally {
			if(writer != null) writer.close();
		}
		
		return true;
	}

}
