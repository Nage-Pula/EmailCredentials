package com.EmailCredentials.DepartmentDetails;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DepartmentDetails {
	String departmentName;
	int DepartmentCode;
	int deptcode = 0;
	Scanner sc = new Scanner(System.in);

	/*
	 * 1. Technical
	 * 2. Admin
	 * 3. Human Resource
	 * 4. Legal
	 * listDepartmentDetails method is used to display the list of departments
	 */
	void listDepartmentDetails() {
		System.out.println("Please Enter Department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal" );

	}

/*
 * selectDepartment method is used to select the department from the list of departments
 * user can select the department by entering the department code, 
 * allows only numbers between 1 and 4
 */
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

	/*
	 * getdeptname method is used to get the department name
	 * @return departmentName
	 */
	public String getdeptname() {
		// Placeholder for next logic
		return this.departmentName;
	}
	public void setDeptName(String deptName) {
		this.departmentName = deptName;
	}

}
