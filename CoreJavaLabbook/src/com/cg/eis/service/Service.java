package com.cg.eis.service;

import com.cg.eis.bean.Employee;

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
	public void check()
	{
		if((salary>5000 && salary<20000))
		{
			insuranceScheme="Scheme C";
			designation="System Associate";
		}
		else if((salary>=20000 && salary<40000))
		{
			insuranceScheme="Scheme B";
			designation="Programmer";
		}
		else if((salary>=40000))
		{
			insuranceScheme="Scheme A";
			designation="Manager";
		}
		else
		{
			insuranceScheme="No Scheme";
			designation="Clerk";
		}
	}
	@Override
	public String toString() {
		return "Service [designation=" + designation + ", insuranceScheme="
				+ insuranceScheme + "]";
	}

}
