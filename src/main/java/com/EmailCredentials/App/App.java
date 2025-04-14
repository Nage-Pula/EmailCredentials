package com.EmailCredentials.App;

import com.EmailCredentials.Service.ServiceClass;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ServiceClass serviceClass = new ServiceClass();
		serviceClass.showCredentials();
	}
}
