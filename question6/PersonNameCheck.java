package question6;

import java.util.Scanner;

public class PersonNameCheck {

private String fname;
private String lname;

	
	public PersonNameCheck() {
	super();
}


	public PersonNameCheck(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("First Name: ");
String fname=sc.nextLine();
System.out.println("Last Name: ");
String lname=sc.nextLine();
	
PersonNameCheck p=new PersonNameCheck();
p.setFname(fname);
p.setLname(lname);
try{

	p.checkName();
}
catch(NameException e)
{
	System.out.println(e.getMessage());
}
sc.close();
	}
	
public void checkName() throws NameException
{
if((fname.length()==0)||(lname.length()==0))
{
	throw new NameException("Enter valid Name!!");
}
else
{
	System.out.println(fname+" "+lname);
}
}


}


