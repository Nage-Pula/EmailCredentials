package com.EmailCredentials.EmployeeDetails;

public class EmployeeDetails {
	private String firstName;
	private String lastName;
	/*
	 * Constructor to initialize the first name and last name of the employee
	 */
	public EmployeeDetails(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/*
	 * Getters and Setters for first name and last name
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}

}
