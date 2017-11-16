package question4;

public class Account {


	long accNumb=0;
	
	double balance;
	//final int minbal=500;
	
	public Account()
	{
		
	}
	
	public Account(double balance )
	{
	
		this.balance=balance;
	}
	
	
	
	//getters and setters
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		
	}

	//functions
	public void deposit(double addbal)
	{
		++accNumb;
		balance+=addbal;
		
	}
	public void withdrawal(double withdraw)
	{
		/*if(balance>withdraw)
		{
		balance-=withdraw;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}*/
	}
	public String toString()
	{
		
		return "Account Number: "+(accNumb+=1)+"\n"+"Balance: "+balance;
		
	}
	}

