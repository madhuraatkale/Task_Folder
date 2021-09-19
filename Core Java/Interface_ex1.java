package edu;

public class Interface_ex1 {

	public static void main(String[] args) {
		
		Maths m=new Maths();
		m.Languages();

	}

}
 
	interface English{
	void Languages();
}
	interface Japnese{
		void Languages();
	}
	 
	class Maths implements English,Japnese{
		
		public void Languages() {
			
			System.out.println("This are various Languages");
		}
	}