package edu;

public class Thread_Task2 {

	public class Practice1{
		public static void main(String args[]){
			Praj p= new Praj(); 
			Gunjan g=new Gunjan();
			
			Ragini r=new Ragini();
			p.start(); try{ p.join(); 
			} 
			catch(Exception e)
			{
				System.out.println(e);
				} 
			g.start();
			try{ 
				g.join(); 
				} 
			catch(Exception e)
			{ 
				System.out.println(e);
				} 
			r.start();
			} 
		}
	class Praj extends Thread {
		public void run(){
			for(int i=1;i<=5;i++) 
			{ 
				
				System.out.println("This is Pranita C : "+i); 
				} 
			} 
		} 
	class Gunjan extends Thread{
		public void run(){
			for(int i=1;i<=5;i++) 
			{
				System.out.println("This is Gunjan : "+i);
				} 
			}
		} 
	class Ragini extends Thread{ 
		public void run(){
					for(int i=1;i<=5;i++) 
					{
						System.out.println("This is Ragini : "+i);
					}
	}
}
}
