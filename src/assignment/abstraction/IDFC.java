package assignment.abstraction;

public class IDFC implements RBI{
	double balance;
	double interest;
	
	public IDFC(double balance , double interest) {
		this.balance=balance;
		this.interest=interest;
	}
	

	@Override
	public void withdraw(double amount) {

		balance = balance-amount;
		System.out.println("Withdraw money: "+balance);
	}

	@Override
	public void deposit(double a) {

		balance = balance + a;
		System.out.println("Deposited money: "+balance);
		
	}

	@Override
	public double checkBalance() {
		return balance;
	}

	@Override
	public void interest() {

		balance = balance+balance*interest/100;
	}


}
