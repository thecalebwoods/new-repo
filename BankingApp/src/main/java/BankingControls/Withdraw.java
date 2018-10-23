package BankingControls;

import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Utilities.AccSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;
import Utilities.UserSerialize;
import Views.UserAccounts;
import adminEmployees.Employees;

public class Withdraw {

	public static void withdrawMoneyFrom(Customers cust) {
		
		CustomerServ custServ = new CustomerServ();
		
		Scanner depo = new Scanner(System.in);
		
		double balance1 =0.0;
		long idFile = 0;
		String user1 = null;
		
		Accounts accounts = custServ.getAccID(cust.getPrivID());
		
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
