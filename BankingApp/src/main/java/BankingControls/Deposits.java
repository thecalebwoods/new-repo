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
import Views.Home;
import Views.UserAccounts;

public class Deposits {

public static void depositMoneyToo(Customers cust) {
		
		CustomerServ custServ = new CustomerServ();
	
		Scanner depo = new Scanner(System.in);
		
		double amountIn = 0.0;
		double balance1 =0.0;
		long Id = 0;
		long idFile = 0;
		System.out.println("hello");
		
		Accounts accounts = custServ.getAccID(cust.getPrivID());;
		
		
		
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

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		UserAccounts.userAccOptions(cust);
		
	}	
	
	
}
