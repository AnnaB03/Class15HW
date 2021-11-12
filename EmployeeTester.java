package com.syntax.class15HW;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee E1 = new Employee();
		E1.name = "Asgar";
		E1.empID = "12345";
		E1.salary = 5000;
		
		Employee E2 = new Employee();
		E2.name = "Asel";
		E2.empID = "56789";
		E2.salary = 5000;
		
		System.out.println("Employee's name is "+ E1.name + ", his empID is "+ E1.empID + ", his salary is "+ E1.salary+ " and the CEO of the company is "+ E1.CEO);
		System.out.println("Employee's name is "+ E2.name + ", his empID is "+ E2.empID + ", his salary is "+ E2.salary+ " and the CEO of the company is "+ E2.CEO);
	}

}
