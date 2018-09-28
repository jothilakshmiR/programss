package com.program.Employeees;

import java.util.Date;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Work {
@Id
	  private int empId;  
	    private String empName; 
	    @Embedded
	    private String empDept;  
	    private int empsalary;
	    private Date empjoinedOn;
	 
	    public int getSalary() {
			return empsalary;
		}

		public void setSalary(int salary) {
			this.empsalary = salary;
		}

		public Date getJoinedOn() {
			return empjoinedOn;
		}

		public void setJoinedOn(Date joinedOn) {
			this.empjoinedOn = joinedOn;
		}

		public Work()
	    {}  
	    
	    public Work(int empId, String empName, String empDept ,int empsalary, Date empjoinedOn) {  
	    super();  
	    this.empId = empId;  
	    this.empName = empName;  
	    this.empDept = empDept; 
	    this.empsalary=empsalary;
	    this.empjoinedOn=empjoinedOn;
	    }
	    
	    public int getEmpId() {
	    return empId;
	    }
	    
	    public void setEmpId(int empId) {
	    this.empId = empId;
	    }
	    
	    public String getEmpName() {
	    return empName;
	    }
	    
	    public void setEmpName(String empName) {
	    this.empName = empName;
	    }
	    
	    public String getEmpDept() {
	    return empDept;
	    }
	    
	    public void setEmpDept(String empDept) {
	    this.empDept = empDept;
	    }   
	        
	    @Override
	    public String toString() {
	        return "Employee [empId=" + empId + ", empName=" + empName
	                + ", empDept=" + empDept + ",empsalary=" + empsalary +",empjoinedOn=" + empjoinedOn +"]";
	    }
	  }  

