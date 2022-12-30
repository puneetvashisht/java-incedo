package com.incedo.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		File file = new File("/home/downloads/user");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Declaring a string variable
		String st;
		// Condition holds true till
		// there is character in a string
		try {
			while ((st = br.readLine()) != null)

				// Print the string
				System.out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
