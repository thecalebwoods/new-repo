package Views;
import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Utilities.AccSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;
import Utilities.UserSerialize;


public class CreateAccount {

	
	public static void createAcc() {
		Scanner YourAcc = new Scanner(System.in);
		
		CustomerServ custServ = new CustomerServ();


		Accounts accounts = new Accounts();
		double balance = 0;
		long id = 0;
		String name = null;
		
		accounts.setBalance(0);

		Accounts users = custServ.save(accounts);
		
		SignUp.signUpUser(accounts);
	}
	
}
