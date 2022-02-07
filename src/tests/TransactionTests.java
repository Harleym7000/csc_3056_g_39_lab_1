package tests;

import java.sql.Date;
import model.Transaction;

public class TransactionTests {

	public static void main(String[] args) {
		
		Transaction t1 = new Transaction("12345678", 60.00, Date.valueOf("07/02/2022"));
		System.out.println(t1);

	}
}
