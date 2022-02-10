package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Manual Testing
		
//		User u1 = new User("hmulholland08@qub.ac.uk", "Password1234", "Harley", "Mulholland", "07912345678");
//		User u2 = new User("hwilson31@qub.ac.uk", "Password5678", "Hannah", "Wilson", "07987654321");
//		System.out.println(u1);
//		System.out.println(u2);
		
		// Automated testing
		String test_username = "mike";
		String test_password = "my_passwd";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		Boolean passed = true;
		
		if(testUser.getUsername() != test_username) {
			System.out.println("TC1 failed: Username did not match");
			passed = false;
		}
		if(testUser.getPassword() != test_password) {
			System.out.println("TC2 failed: Password did not match");
			passed = false;
		}
		if(testUser.getFirst_name() != test_first_name) {
			System.out.println("TC3 failed: First Name did not match");
			passed = false;
		}
		if(testUser.getLast_name() != test_last_name) {
			System.out.println("TC4 failed: Last Name did not match");
			passed = false;
		}
		if(testUser.getMobile_number() != test_mobile_number) {
			System.out.println("TC5 failed: Mobile number did not match");
			passed = false;
		}
		if(passed) {
			System.out.println("All TC's passed");
		}
		
		//Using asserts
		
		assert testUser.getUsername() == test_username;
		//assert 1 == 2;
		assert testUser.getPassword() == test_password;
		assert testUser.getFirst_name() == test_first_name;
		assert testUser.getLast_name() == test_last_name;
		assert testUser.getMobile_number() == test_mobile_number;
		System.out.println("All java assertions in the test suite passed (none failed).");
	}
}