package com.naveen; 

import com.naveen.IEmployee;


class MyExample {
	public static void main(String args[]) {
		System.out.println("Initial Static Value " +Employee.empIdCounter); 
		IEmployee e = new Employee(); 
		e.setEmpId(Employee.empIdCounter++); 
		e.setEmpName("Bhavya");
		e.sayhi(); 
        
		IEmployee e1 = new Employee(); 
		e1.setEmpId(Employee.empIdCounter++); 
		e1.setEmpName("Sachin");
		
		
		System.out.println(e.getEmpId() +", " + e.getEmpName()); 
		System.out.println(e1.getEmpId() +", " + e1.getEmpName()); 		
		
	 
	}
}
