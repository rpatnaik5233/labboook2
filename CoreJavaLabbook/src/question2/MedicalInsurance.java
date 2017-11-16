package question2;

import java.util.Scanner;

public class MedicalInsurance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float salary;
		String designation;
		String scheme;
		System.out.println("Enter the salary: ");
		salary=sc.nextFloat();
		if(salary>=5000 && salary<20000 )
		{
			designation="System Associate";
			scheme="Scheme A";
		}
		else if(salary>=20000 && salary<40000)
		{
			designation="Programmer";
			scheme="Scheme B";
		}
		else if(salary>=40000)
		{
			designation="Manager";
			scheme="Scheme C";
		}
		else
		{
			designation="Clerk";
			scheme="No Scheme";
		}
		
		System.out.println("Scheme:"+scheme);
		
	}

}
