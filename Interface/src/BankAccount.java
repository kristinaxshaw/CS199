// Kristina Shaw
// CS 176L
// Interface Version 1

// establishing a public class 
public class BankAccount implements Measurable{
	private double balance;
	
	// creates a new bank account with a balance of zero
	public BankAccount() {
		balance = 0;
	}
	
	// creates a bank account with a given balance
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	// command to deposit money into the bank account'
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	// command to withdraw money from the bank account
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	// command to read the current balance of the bank account
	public double getBalance() {
		return balance;
	}
	
	// command to add the interest rate to the balance of the bank account
	public void addInterest(double rate) {
		balance = balance + balance * rate / 100;
	}
	
	@Override
	public double getMeasure() {
		return balance;
	}

}
