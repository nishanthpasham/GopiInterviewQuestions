package com.ud.data;

public class Employee {

	private int employeeId;
	private String lastName; 
	private String firstName;
	
	public Employee(int employeeId, String lastName) {
		this.employeeId = employeeId;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean equals (Object emp) {
		if(emp == null) {
			return false;
		} if(!(emp instanceof Employee)) {
			return false;
		}
		Employee e = (Employee) emp;
		if(e.employeeId != employeeId) {
			return false;
		} if(lastName.equals(e.lastName)) {
			return false;
		}
		return false;
	}
	
	public int hascode() {
		int prime = 31;
		int result = prime * employeeId;
		result += 17;
		result += prime * lastName.hashCode(); 
		return result;
	}
	
}
