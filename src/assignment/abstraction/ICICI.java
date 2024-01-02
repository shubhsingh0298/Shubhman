package assignment.abstraction;

public  class ICICI implements RBI
{
	double balance;
	double interest;
	
	public ICICI(double balance , double interest) {
		this.balance=balance;
		this.interest=interest;
	}
	

	@Override
	public void withdraw(double amount) {
		 if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    
	}
	@Override
	public void deposit(double amount) {

		if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    

	

		
}
