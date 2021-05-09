package com.pname.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private int empId;
	private String name;
	private boolean married;
	private String managerName;
	private double Salary;
	private String department;
	private String mothersName;
	
	private Address address;

}
