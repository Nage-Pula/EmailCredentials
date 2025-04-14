package com.EmailCredentials.App;

import com.EmailCredentials.Service.ServiceClass;

/**
 * showCredentials method is used to display the credentials of the user.
 */
public class App {
	public static void main(String[] args) {
		ServiceClass serviceClass = new ServiceClass();
		serviceClass.showCredentials();
	}
}
