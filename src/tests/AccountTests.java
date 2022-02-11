package tests;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.Account;

public class AccountTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test comment accounts
		Date date = new Date();
		Account a1 = new Account("12345678", "hmulholland08@qub.ac.uk", "Student", date);
		Account a2 = new Account("8765421", "hwilson31@qub.ac.uk", "Student", date);
		System.out.println(a1);
		System.out.println(a2);
	}
}
