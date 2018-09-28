package com.program.Employeees;

import java.util.Date; 

public class EmployeeService {
	
	 public static void main(String[] args) {
	        
	        EmployeeDao empDAO = new EmployeeDao();
	        
	        Work createEmp1 = new Work(1, "Priya","Accountant",20000,(new Date()));
	        Work createEmp2 = new Work(10, "Priya","Officer",26000,(new Date()));
	        empDAO.insert(createEmp1);//Create
	        empDAO.insert(createEmp2);//Create
	        
	        Work readEmp = empDAO.get(1);//Read        
	        System.out.println(readEmp);
	        
	        Work updateEmp = new Work(1,"Raji","Admin",20000,(new Date()));        
	        empDAO.update(updateEmp);//Update
	        
	        empDAO.delete(1); //Delete
	                
	    }
	}
	 


