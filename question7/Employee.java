package question7;

import com.cg.eis.exception.SalaryException;

public class Employee {

private int id;
private String name;
private float salary;

public Employee()
{
	
}
public Employee(int id,String name,float salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public void check()throws SalaryException{
	try{
	if(salary<3000)
	{
		throw new SalaryException("Salary is less than 3000");
	}
	}
	catch(SalaryException s)
	{
		System.out.println(s.getMessage());
	}
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
			+"]";
}

	}


