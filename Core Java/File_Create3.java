package edu;

public class File_Create3 {

	public static void main(String[] args) {
		try { 
			File Obj = new File("Pooja123.txt");
			Scanner obj1 = new Scanner(Obj); 
			while (obj1.hasNextLine())
			{ 
				String obj2 = obj1.nextLine(); 
			System.out.println(obj2); 
			}
			
			obj1.close(); 
		}
		catch (FileNotFoundException e)
		{ System.out.println("Sorry for the trouble"); 
		} 

	}

}
