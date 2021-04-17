package com.naveen;

import com.naveen.IEmployee;

class Employee implements IEmployee{
	private int empId; 
	private String empName;
	 
	// this is stored at class level, and you dont have to create a 
	// instance of it to access 
	 static int empIdCounter=101; 
	 public void setEmpId(int empId) {
         this.empId = empId; 
     }

     public void setEmpName(String empName){
         this.empName = empName; 
     }
     public int getEmpId() {return this.empId;}
     public String getEmpName() {return this.empName;}
     
	public void sayhi() {

        System.out.println("hi"); 
    }
}
