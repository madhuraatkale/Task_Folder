package edu;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class File_Create {

	public static void main(String[] args) {
		
		try
		{
			File Obj = new File("Maddy08.txt");
			if(Obj.createNewFile()) 
			{
				System.out.println("******file created******");
				System.out.println("Name of the file="+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
			
			catch(IOException e) 
			{
				System.out.print(e);
			}
		
		}
	}



