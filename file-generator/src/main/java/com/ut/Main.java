package com.ut;

import java.io.IOException;
import java.util.Scanner;

import com.ut.util.FileWriterUtil;
import com.ut.util.impl.FileWriterUtilImpl;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a number of lines from 1 to 230: ");
		Integer input = scanner.nextInt(); 
		
		System.out.println("\nResult: ");
		FileWriterUtil fileWriterUtil = new FileWriterUtilImpl();
		if(fileWriterUtil.isFileGenerated(input)) {
			System.out.println("File creation success");
		} else {
			System.out.println("File creation failed");
		}
	}

}
