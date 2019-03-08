package lab2;

public abstract class Account {
	
	protected double balance;
	
	protected Account() {
		
	}
	
	protected Account(double balance) {
		
		this.balance = balance;
		
	}
	
	public double deposit(double amount) {
		
		return this.balance + amount;
		
	}
	
	public double withdraw(double amount) {
		
		return this.balance - amount;
		
	}
	
	public abstract double annualInterest();
	
}
