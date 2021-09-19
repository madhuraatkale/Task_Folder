package edu;

public class Task_acc {

	public static void main(String[] args) {
	BankAccount a=new BankAccount("123456","Madhura A");
	SavingsAccount saving =new SavingsAccount("1234","Tejas A");
	
	a.deposit(500);
	a.deposit(1500);
	
	System.out.println("Blance is:" +a.getBalance());
	
	a.withdraw(400);
	
	System.out.println("After withdraw Blance is:" +a.getBalance());
	}

}
	class BankAccount{
		
		private String accountName = "Madhura A";

		
		
		public String getAccountName() {
			return accountName;
		}

		
		public int getAccountNumber() {
			return accountNumber;
		}

		public void deposit(double amount) {
			balance+=amount;
		}
		public void withdraw(double amount) {
			balance-=amount;
		}

		public double getBalance() {
			return balance;
		}

	

		int accountNumber;
		double balance;
		
		BankAccount(String accNumber,String accName){
			
		}
	}
	
	 class SavingsAccount extends BankAccount{
		SavingsAccount(int)

	
	
	

	