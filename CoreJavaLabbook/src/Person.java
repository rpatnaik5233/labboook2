import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.regex.Pattern;


public class Person {
	
	String fname;
	 String lname;
	Gender gender;
	long ph;
	public Person()
	{
		
	}
	 public Person(String fname, String lname, Gender gender,long ph)
	 {
		 this.fname=fname;
		 this.lname=lname;
		 this.gender=gender;
		 this.ph=ph;
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
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	
	public void calculateAge()
	{
		LocalDate dob=LocalDate.of(1996, Month.FEBRUARY, 10);
		Period p=(LocalDate.now()).until(dob);
		System.out.println("Age: "+p);
	}
	public void getFullName(String fname, String lname)
	{
		System.out.println("Full Name: "+fname+" "+lname);
	}
	
	public void output()
	{
	System.out.println("Person Details:");
	System.out.println("____________\n");
	System.out.println("First Name: "+fname);
	System.out.println("Last Name: "+lname);
	System.out.println("Gender: "+gender);
	System.out.println("Phone No: "+ph);
	}
	}


