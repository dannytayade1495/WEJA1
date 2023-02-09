package com.jspiders.serializationdesrialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdesrialization.object.User;

public class UserMain {

	public static void main(String[] args) {
		try {
		File file;
		FileInputStream fileInputStream;
		FileOutputStream fileOutputStream;
			
		
			file = new File("Object.txt");
			if (file.exists()) {
				System.out.println("File already exists");
			} else {
					file.createNewFile();
					System.out.println("File created");
			}
			fileOutputStream = new FileOutputStream(file);
			fileInputStream = new FileInputStream(file);
			
			//Serialization
			ObjectOutputStream objectOutputStream = 
					new ObjectOutputStream(fileOutputStream);
			User user = new User(1, "Arjun", "arjun@gmail.com");
			objectOutputStream.writeObject(user);
			System.out.println("Object written to file.");
			objectOutputStream.close();
			
			//Desrialization
			ObjectInputStream objectInputStream = 
					new ObjectInputStream(fileInputStream);
			User output = (User)objectInputStream.readObject();
			System.out.println(output);
			objectInputStream.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
