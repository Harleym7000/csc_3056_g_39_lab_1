package tests;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.Account;

public class AccountTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDate1="04/02/2022";  
	    Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Account a1 = new Account("12345678", "hmulholland08@qub.ac.uk", "Student", date1);
		System.out.println(a1);
	}

}
