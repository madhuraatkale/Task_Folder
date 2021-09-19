package edu;

public class Abstract_ex1 {

	public static void main(String[] args) {
		PNB p=new PNB();
			p.CarLoan();
			p.Total_RBIBalance();

	}

}

//Abstract class (0-100%)

abstract class RBI{
	
	abstract void PersonalLoan();
	abstract void CarLoan();
	abstract void HousingLoan();
	
	private final void PersonalLoan_RBI() {
		System.out.println("This is for RBI personalLoan");
	}
	
	private final void CarLoan_RBI() {
		System.out.println("This is for RBI CarLoan");
	}
		
	private final void HousingLoan_RBI() {
		System.out.println("This is for RBI HousingLoan");
	}
		void Total_RBIBalance() {
			System.out.println("122456822 Million");
	
	}
}
		
		
		class PNB extends RBI{
			void PersonalLoan() {
				System.out.println("This is for PNB personalLoan");
			}
			void CarLoan() {
				System.out.println("This is for PNB CarLoan");
		}
			void HousingLoan() {
				System.out.println("This is for PNB HousingLoan");
			}	
			
			}

		
		
		
		