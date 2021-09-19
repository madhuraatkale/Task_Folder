package edu;

public class Thread_signal {

	public class Practice1{
		public static void main(String args[]){ 
			Red r = new Red(); 
			Green g = new Green();
			
			r.start(); 
			g.start(); 
			} 
		} 
	class Red extends Thread 
	{ 
		public void run(){
		for(int i=1;i<=5;i++) 
		{
			System.out.println("Now its Red Signal : "+i);
			try{ Thread.sleep(5000);
			} 
			catch(Exception e)
			{
				System.out.println(e);
				}
			}
		}
	}
	
	class Green extends Thread{
		public void run()
		{
			for(int i=1;i<=5;i++) 
			{ 
				System.out.println("Now its Green Signal : "+i);
				try{ Thread.sleep(10000); 
				} 
				catch(Exception e)
				{ 
					System.out.println(e);
					} 
				} 
			}
		} 
}
