package com.jspiders.serializationanddeserialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serializationanddeserialization.object.User;

public class Serialization {
	public static void main(String[] args) throws IOException {
		
		File file = new File("F:/File/Demo.txt");		
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User(1, "Ram", "ram@gmail.com", 7845963110l));
		System.out.println("Serialized");
		
		objectOutputStream.close();
		fileOutputStream.close();
	}
}
