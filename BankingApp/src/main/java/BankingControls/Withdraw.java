package BankingControls;

import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Utilities.AccSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;
import Utilities.UserSerialize;
import Views.BankScanner;
import Views.SignIn;
import Views.UserAccounts;
import adminEmployees.Employees;

public class Withdraw {

	public static void withdrawMoneyFrom(Customers cust) {
		CustomerServ custServ = new CustomerServ();	

		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++                     +++++++");
		System.out.println("++++++    Joint Acc (1)    +++++++");
		System.out.println("++++++     Priv Acc (2)    +++++++");
		System.out.println("++++++                     +++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		int input = BankScanner.getInput(2);
		
		switch (input){
		case 1: 
		
		boolean exists = CustomerDao.isJointPresent(cust.getJoID());
		
		if(exists = true) {
			Accounts accounts = custServ.getAccID(cust.getJoID());
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("++++   Hello " + cust.getUser() + "!");
			System.out.println("++++++++++++++++++++++++++++++++++");
			withdraw(accounts, cust);

		}else {
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("++++                         +++++");
			System.out.println("++++          Sorry!         +++++");
			System.out.println("++++        ---------        +++++");
			System.out.println("++++        This user        +++++");
			System.out.println("++++     does not have a     +++++");
			System.out.println("++++      Joint Account      +++++");
			System.out.println("++++                         +++++");
			System.out.println("++++++++++++++++++++++++++++++++++");
		
			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.print("+++++++++++ Going Back");
			
			SignIn.loading();
		}; break;
		
		case 2: Accounts accounts = custServ.getAccID(cust.getPrivID());
				withdraw(accounts, cust); break;
		}
	}
	
	public static void withdraw(Accounts accounts, Customers cust) {

		Scanner depo = new Scanner(System.in);
		
		double balance1 =0.0;
		long idFile = 0;
		String user1 = null;
				
		balance1 = accounts.getBalance();
		idFile = accounts.getId();
		
		System.out.println(balance1);
		
		double amountOut = 0.0;
		
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++ Withdraw Amount: ");
		
		
		amountOut = depo.nextDouble();
		
		System.out.println("Old " + cust.getUser().toUpperCase()+" amount:" + balance1);
		
		if(balance1 - amountOut < 0){
			System.out.println("");
			System.out.print("Withdraw Not Possible");
		} else {balance1 -= amountOut;}
		
		System.out.println("New " + cust.getUser().toUpperCase()+" amount:" + balance1);
		
		
		
		accounts.setBalance(balance1);
		accounts.setId(idFile);	
		
		CustomerDao.updateAcc(accounts);
		
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("+++++++++++ Going Back");

		SignIn.loading();
		
		UserAccounts.userAccOptions(cust);
		
	}	
}
