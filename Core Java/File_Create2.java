package edu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class File_Create2 {

	public static void main(String[] args) {
		try
		{
			FileWriter obj = new FileWriter("Maddy08"); 
			obj.write("Welcome to Edubridge");
			obj.close();
			System.out.println("File is updated");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
