package tests;

import java.util.Date;

import model.Transaction;

public class TransactionTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Transaction t1 = new Transaction("12345678", 50.00, date);
		Transaction t2 = new Transaction("87654321", 50.00, date);
		System.out.println(t1);
		System.out.println(t2);
	}

}
