package com;

public class GCollector {
	public static void main(String[] args) {
		Employee emp = new Employee("Tarun",21);
		Employee emp1 = new Employee("Arun",22);
		emp.show();
		emp1.show();
		Employee.nextfreshID();
		{ 
	            Employee X = new Employee("GFG4", 23);
	            Employee Y = new Employee("GFG5", 21);
	            X.show();
	            Y.show();
	            Employee.nextfreshID();
	            //Y.nextfreshID();
	            X=Y=null;
	            Employee.nextfreshID();
	    }
		System.gc();
		Employee.nextfreshID();
		Employee A = new Employee("GFG4", 23);
        Employee B = new Employee("GFG5", 21);
        A.show();
        Employee.nextfreshID();
        B.show();
        Employee.nextfreshID();
	}
}
