package com.EmailApplicationforDepartments.EmailCredentials;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.EmailCredentials.CredentialService.CredentialService;
import com.EmailCredentials.DepartmentDetails.DepartmentDetails;
import com.EmailCredentials.EmployeeDetails.EmployeeDetails;

public class AppTest {

	CredentialService cs = new CredentialService();
	/*
	 * Test method for
	 * {@link com.EmailCredentials.CredentialService.CredentialService#generatePassword()}
	 * 
	 */
	@Test
	public void testPasswordLength() {
		String password = cs.generatePassword();
		assertEquals(8, password.length(), "Password must be 8 characters long");
	}
	
	@Test
	public void testPasswordUniqueness() {
		String password = cs.generatePassword();
		long uniqueCount = password.chars().distinct().count();
		assertEquals(8, uniqueCount, "All characters in password must be unique");
	}

	@Test
	public void testPasswordComposition() {
		String password = cs.generatePassword();

		boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
		boolean hasLower = password.chars().anyMatch(Character::isLowerCase);
		boolean hasDigit = password.chars().anyMatch(Character::isDigit);
		boolean hasSpecial = password.chars().anyMatch(c -> "!@#$%^&*()-_=+[]{}".indexOf((char)c) >= 0);

		assertTrue(hasUpper, "Password must have at least one uppercase letter");
		assertTrue(hasLower, "Password must have at least one lowercase letter");
		assertTrue(hasDigit, "Password must have at least one digit");
		assertTrue(hasSpecial, "Password must have at least one special character");
	}
	/*
	 * Test method for
	 * {@link com.EmailCredentials.CredentialService.CredentialService#generateEmail(com.EmailCredentials.EmployeeDetails.EmployeeDetails, com.EmailCredentials.DepartmentDetails.DepartmentDetails)}
	 * 
	 */
	@Test
	public void testEmailFormat() {
		EmployeeDetails emp = new EmployeeDetails("John", "Doe");
		DepartmentDetails dep = new DepartmentDetails();
		dep.setDeptName("Technical");

		CredentialService cs = new CredentialService();
		String email = cs.generateEmail(emp, dep);

		assertEquals("johndoe@technical.company.com", email);
	}

}
