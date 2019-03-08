package lab2;

public class Savings extends Account {

	@Override
	public double annualInterest() {
		
		return (this.balance * 1.1d);
		
	}

}
