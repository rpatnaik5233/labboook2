package question4;

public class SavingsAccount extends Account {
	private static final int minbal=500;
	double balance;
	public SavingsAccount()
	{
		super();
	}
	public SavingsAccount(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public void withdrawal(double withdraw)
	{
		if(balance>minbal)
		{
		if(balance>withdraw)
		{
		balance-=withdraw;

		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		}
		else
		System.out.println("Balance is less than 500");
	}

}
