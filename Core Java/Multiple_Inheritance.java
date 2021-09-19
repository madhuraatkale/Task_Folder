package edu;

public class Multiple_Inheritance {

	public static void main(String[] args) {
		
		B b = new B();
		b.display();

	}

}
class A {
	public int display() {
		System.out.println("This is method of class A");
		return 6;
	}
}
	class B extends A {
		public int display() {
			System.out.println("This is method of class B");
			return 5;
		}
	}