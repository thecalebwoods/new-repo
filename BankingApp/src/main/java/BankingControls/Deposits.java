package BankingControls;
import java.io.File;
import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Utilities.AccSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;
import Utilities.UserSerialize;
import Views.BankScanner;
import Views.CreateAccount;
import Views.Home;
import Views.SignIn;
import Views.UserAccounts;

public class Deposits {

public static void depositMoneyToo(Customers cust) {
		
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
			deposit(accounts, cust);

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
				deposit(accounts, cust); break;
		}
	}

	public static void deposit(Accounts accounts, Customers cust) {

		Scanner depo = new Scanner(System.in);

		double amountIn = 0.0;
		double balance1 =0.0;
		long Id = 0;
		long idFile = 0;
		
		balance1 = accounts.getBalance();
		idFile = accounts.getId();
		
		
		
		System.out.println(balance1);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++ Deposit Amount: ");
		
		amountIn = depo.nextDouble();
		
		System.out.println("Old " + cust.getUser()+" amount:" + balance1);
		
		balance1 += amountIn;
		
		System.out.println("New " + cust.getUser()+" amount:" + balance1);
		
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
