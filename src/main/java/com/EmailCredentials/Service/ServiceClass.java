package com.EmailCredentials.Service;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.EmailCredentials.CredentialService.CredentialService;
import com.EmailCredentials.DepartmentDetails.DepartmentDetails;
import com.EmailCredentials.EmployeeDetails.EmployeeDetails;
public class ServiceClass {
	private String FirstName;
	private String LastName;
	Scanner sc = new Scanner(System.in);

	void getEmployeeDetails() {
		while (true) {
			System.out.print("Enter First Name: ");
			String firstInput = sc.nextLine().trim();
			if (isValidName(firstInput)) {
				this.FirstName = capitalize(firstInput);
				break;
			} else {
				System.out.println("Invalid first name. Please enter alphabets only.");
			}
		}

		while (true) {
			System.out.print("Enter Last Name: ");
			String lastInput = sc.nextLine().trim();
			if (isValidName(lastInput)) {
				this.LastName = capitalize(lastInput);
				break;
			} else {
				System.out.println("Invalid last name. Please enter alphabets only.");
			}
		}
	}

	public boolean isValidName(String input) {
		return input != null && !input.isEmpty() && input.matches("[a-zA-Z]+");
	}

	public void showCredentials() {
		Wish();
		getEmployeeDetails();
		EmployeeDetails emp = new EmployeeDetails(capitalize(FirstName), capitalize(LastName));
		DepartmentDetails dep = new DepartmentDetails();
		CredentialService cs = new CredentialService();
		System.out.println("Helloo " + emp.getFullName()+"....!");
		dep.selectDepartment();
		WishEmployee();
		System.out.println("your generated credentials are as follows:");
		String email = cs.generateEmail(emp, dep);
		String password = cs.generatePassword();
		System.out.println("Email    ---> " + email);
		System.out.println("Password ---> " + password);
	}
	public String capitalize(String name) {
		if (name == null || name.isEmpty()) return "";
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

	void WishEmployee() {
		LocalDateTime date = LocalDateTime.now();
		int time = date.getHour();
		if (time >= 0 && time < 12) {
			System.out.println("Good Morning "+FirstName+" " + LastName+"..!");
		} else if (time >= 12 && time < 17) {
			System.out.println("Good Afternoon "+FirstName+" " + LastName+"..!");
		} else {
			System.out.println("Good Evening "+FirstName+" " + LastName+"..!");
		}
	}
	void Wish() {
		LocalDateTime date = LocalDateTime.now();
		int time = date.getHour();
		if (time >= 0 && time < 12) {
			System.out.println("Good Morning...!");
		} else if (time >= 12 && time < 17) {
			System.out.println("Good Afternoon...!");
		} else {
			System.out.println("Good Evening...!");
		}
	}


}
