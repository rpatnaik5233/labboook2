package question4;

public class ClientPerson extends Person {

	public static void main(String[] args) {
				Person p1=new Person("Smith", 45);
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
			System.out.println(c.getBalance());
	}

}
