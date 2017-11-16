package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class User extends Employee{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Id: ");
		int id=sc.nextInt();
		System.out.println("Name: ");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Salary: ");
		float salary=sc.nextFloat();
		sc.nextLine();
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		Service s=new Service();
		s.setSalary(salary);
		s.check();
		sc.close();

	}

}
