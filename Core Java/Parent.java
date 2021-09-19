package edu;

public class Parent {

	public static void main(String[] args) {
		Son1 s=new Son1();
		s.addition();
		s.div();
		System.out.println();
		
		Son2 s=new Son2();
		s.
		
		System.out.println();
		
		
		}
	}
//single inheritance

	class father{
		 
		int a=2,b=4;
		int c = a+b;
		int d = a-b;
		public void addition() {
		System.out.println("Addition is :" +c);
		}
		public void subtraction() {
		System.out.println("subtractionis :" +d);
		
	}
	}
	
	class Son1 extends father{
		
		
		int p=2,q=4;
		int l = p*q;
		int m = p/q;
		public void mul() {
		System.out.println("Mulis :" +l);
		}
		public void div() {
		System.out.println("Div :" +m);
		}
		
		class Son2 extends father{
			
			
			int x=2,y=4;
			int z = p%q;
			public void mod() {
			System.out.println("Mod :" +z);
			}	
		}
	}
	
	
	