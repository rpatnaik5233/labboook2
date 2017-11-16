package question4;

public class CurrentAccount extends Account {
private boolean overdraft;
private double balance;
public CurrentAccount()
{
	super();
}
public CurrentAccount(double balance)
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
	if(balance>withdraw)
	{
	balance-=withdraw;
	if(balance>0)
	{
		overdraft=true;
	}
	else
	{
		overdraft=false;
	}
	}
	else
	System.out.println("Balance is less than 500");

if(overdraft)
{
	System.out.println("Limit is not exceeded");
}
else
{
	System.out.println("Limit exceeded");
}
}
}
