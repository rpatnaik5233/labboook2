import java.util.*;
public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String fname,lname;
Gender gender=Gender.M;
char gend;
System.out.println("Enter First Name: ");
fname=sc.nextLine();
System.out.println("Enter Last Name: ");
lname=sc.nextLine();
System.out.println("Enter Gender(M/F): ");
gend = sc.next().charAt(0);
sc.nextLine();
System.out.println("Enter Phone No: ");
long ph=sc.nextLong();
sc.nextLine();
 Person p1=new Person(fname,lname,gender,ph);
p1.getFullName(fname, lname);
 p1.calculateAge();
 p1.output();
 
	}

}
