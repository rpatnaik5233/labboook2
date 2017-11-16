package question1;

import java.util.Scanner;

public class FundsBank {

	public static void main(String[] args) {
	
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Account Holder Name: ");
	String name=sc1.nextLine();
		System.out.println("Enter the type of Account:"+"\n1.Savings Account"+"\n2.Current Account");
	String acctype=sc1.nextLine();
	System.out.println("Account Holder Details:");
		System.out.println("___________");
		System.out.println("Name: "+name);
		System.out.println("Account Type: "+acctype);

	}

}
