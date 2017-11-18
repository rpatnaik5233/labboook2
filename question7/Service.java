package question7;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class Service extends Employee implements EmployeeService{
	float salary;
	String designation;
	String insuranceScheme;
	public Service()
	{
		super();
	}
	public Service(float salary)
	{
		this.salary=salary;
		
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String check(float salary)
	{
		if((salary>5000 && salary<20000))
		{
			insuranceScheme="Scheme C";
			designation="System Associate";
			return insuranceScheme;
		}
		else if((salary>=20000 && salary<40000))
		{
			insuranceScheme="Scheme B";
			designation="Programmer";
			return insuranceScheme;
		}
		else if((salary>=40000))
		{
			insuranceScheme="Scheme A";
			designation="Manager";
			return insuranceScheme;
		}
		else
		{
			insuranceScheme="No Scheme";
			designation="Clerk";
			return insuranceScheme;
		}
	}
	@Override
	public String toString() {
		return "Service [designation=" + designation + ", insuranceScheme="
				+ insuranceScheme + "]";
	}
	
}
