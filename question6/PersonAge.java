package question6;

import java.util.Scanner;

import question4.Account;
import question4.CurrentAccount;
import question4.Person;
import question4.SavingsAccount;

public class PersonAge extends Person  {

	public static void main(String[] args) /*throws AgeException*/ {
		/*Person p1=new Person("Smith", 45);
		Person p2=new Person("Kathy", 40);
		Account a1=new Account(2000);
		Account a2=new Account(3000);
		SavingsAccount s=new SavingsAccount(a2.getBalance());
		CurrentAccount c=new CurrentAccount(a2.getBalance());
		System.out.println(p1);
		System.out.println("Before Deposit: ");
		System.out.println(a1);
		a1.deposit(2000);
		System.out.println("After Deposit: ");
		System.out.println(a1.getBalance());
		System.out.println(p2);
		System.out.println("Before Withdrawal: ");
		System.out.println(a2);
		//a2.withdrawal(2000);
		//s.withdrawal(2000);
		c.withdrawal(2000);
		System.out.println("After Withdrawal: ");
			System.out.println(c.getBalance());*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Age: ");
		float age=sc.nextFloat();
		sc.nextLine();
		Person p1=new Person();
		Person p2=new Person();
		p1.setName(name);
		p1.setAge(age);
		System.out.println("Enter Name: ");
		name=sc.nextLine();
		System.out.println("Enter Age: ");
		age=sc.nextFloat();
		sc.nextLine();
		p2.setName(name);
		p2.setAge(age);
		/*try{
			p.check();
		}
		catch (AgeException a)
		{
			a.getMessage();
		}*/
	Account a1=new Account(2000);
	Account a2=new Account(3000);
	SavingsAccount s=new SavingsAccount(a2.getBalance());
	CurrentAccount c=new CurrentAccount(a2.getBalance());
	System.out.println(p1);
	System.out.println("Before Deposit: ");
	System.out.println(a1);
	a1.deposit(2000);
	System.out.println("After Deposit: ");
	System.out.println(a1.getBalance());
	System.out.println(p2);
	System.out.println("Before Withdrawal: ");
	System.out.println(a2);
	//a2.withdrawal(2000);
	//s.withdrawal(2000);
	c.withdrawal(2000);
	System.out.println("After Withdrawal: ");
		System.out.println(c.getBalance());
	p1.validate();
	p2.validate();
	sc.close();
	}
	
	
}
