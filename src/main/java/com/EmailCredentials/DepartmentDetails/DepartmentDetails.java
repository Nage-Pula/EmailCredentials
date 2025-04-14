package com.EmailCredentials.DepartmentDetails;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DepartmentDetails {
	String departmentName;
	int DepartmentCode;
	int deptcode = 0;
	Scanner sc = new Scanner(System.in);
	//(Technical, Admin, Human Resource, Legal)
	void listDepartmentDetails() {
		System.out.println("Please Enter Department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal" );

	}


	public void selectDepartment() {

		boolean valid = false;

		// Show department options only once
		listDepartmentDetails();
		while (!valid) {
			System.out.print("Enter department code (1-4): ");
			try {
				int deptcode = sc.nextInt();

				switch (deptcode) {
				case 1:
					this.departmentName = "Technical";
					this.DepartmentCode = 1;
					valid = true;
					break;
				case 2:
					this.departmentName = "Admin";
					this.DepartmentCode = 2;
					valid = true;
					break;
				case 3:
					this.departmentName = "Human Resource";
					this.DepartmentCode = 3;
					valid = true;
					break;
				case 4:
					this.departmentName = "Legal";
					this.DepartmentCode = 4;
					valid = true;
					break;
				default:
					System.out.println("❌ Invalid code! Please enter a number between 1 and 4.");
				}

			} catch (InputMismatchException e) {
				System.out.println("⚠️ Invalid input! Please enter **only numbers** between 1 and 4.");
				sc.nextLine(); // clear junk input from scanner
			}
		}

		System.out.println("Department selected: "+"'"+ departmentName+"'" );

	}

	public String getdeptname() {
		// Placeholder for next logic
		return this.departmentName;
	}
	public void setDeptName(String deptName) {
		this.departmentName = deptName;
	}

}
