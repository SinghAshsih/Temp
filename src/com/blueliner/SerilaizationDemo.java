package com.blueliner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilaizationDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String message = "Hello How are you";
		FileOutputStream fos = new FileOutputStream("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(message);
		System.out.println("he");

		FileInputStream fio = new FileInputStream("file.txt");
		ObjectInputStream oin = new ObjectInputStream(fio);
		String n = (String) oin.readObject();
		System.out.println(n);
	}
}