package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) {

		File file = new File("CharStream.txt");

		if (file.exists()) {
			System.out.println("File already exists");
		} else {
			try {
				file.createNewFile();
				System.out.println("File created");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Data from program");
				System.out.println("Data written to file.");
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("File not created");
				e.printStackTrace();
			}
		}

	}

}
