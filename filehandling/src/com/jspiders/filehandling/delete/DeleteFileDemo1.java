package com.jspiders.filehandling.delete;

import java.io.File;

public class DeleteFileDemo1 {
	
	public static void main(String[] args) {
		
		File file = new File("Hello.txt");
		
		if (file.exists()) {
			file.delete();
			System.out.println("File deleted.");
		} else {
			System.out.println("File does not exist.");
		}
		
	}

}
