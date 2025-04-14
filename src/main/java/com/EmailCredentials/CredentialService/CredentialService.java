package com.EmailCredentials.CredentialService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.EmailCredentials.DepartmentDetails.DepartmentDetails;
import com.EmailCredentials.EmployeeDetails.EmployeeDetails;
public class CredentialService {
	private String email;
	private String CompanyName = "company.com";
	private  String atSymbol = "@";
	
	public String generateEmail(EmployeeDetails emp, DepartmentDetails dep) {
		this.email = (emp.getFirstName()+emp.getLastName()+ this.atSymbol+dep.getdeptname().replace(" ", "") +"." +this.CompanyName).toLowerCase();
		return this.email;
	}

	public String generatePassword() {
		String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lowercase = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String SpecialCharacters = "!@#$%^&*()_+=-{}[]|:;\"'<>,.?/";
		StringBuilder password = new StringBuilder();

		// Ensure at least one character from each category is included

		password.append(Uniqechar(Uppercase, 2));
		password.append(Uniqechar(Lowercase, 2));
		password.append(Uniqechar(Numbers, 2));
		password.append(Uniqechar(SpecialCharacters, 2));

		List<Character> passwordList = new ArrayList<>();
		for (char c : password.toString().toCharArray()) {
			passwordList.add(c);
		}
		Collections.shuffle(passwordList);
		StringBuilder finalPassword = new StringBuilder();
	    for (char c : passwordList) {
	        finalPassword.append(c);
	    }

	    return finalPassword.toString();
	}	
	public String Uniqechar(String source, int count) {
		Set<Character> usedChars = new HashSet<>();
		Random random = new Random();

		StringBuilder result = new StringBuilder();
		while (result.length() < count) {
			int index =random.nextInt(source.length());
			char c = source.charAt(index);
			if (!usedChars.contains(c)) {
				usedChars.add(c);
				result.append(c);
			}
		}
		return result.toString();
	}
}


