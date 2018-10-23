package BankingControls;

import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Utilities.AccSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;
import Utilities.UserSerialize;
import Views.BankScanner;
import Views.UserAccounts;
import adminEmployees.Employees;

public class Transfer {

	
	public static void transferMoneyFrom(Customers cust) {
		
		CustomerServ custServ = new CustomerServ();
		
		Scanner trans = new Scanner(System.in);
		
		String user1 = null;
		String user2 = null;
		double balance1 =0.0;
		long Id1 = 0;
		
		Accounts account1 = custServ.getAccID(cust.getPrivID());
		
		balance1 = account1.getBalance();
		Id1 = account1.getId();
		
		System.out.println(cust.getUser().toUpperCase()+" balance: " + balance1);
		

		CustomerServ custServ2 = new CustomerServ();

		
		Scanner transTo = new Scanner(System.in);

		double balance2 =0.0;		
		long Id2 = 0;
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++  Please User to Transfer  +++");
		System.out.println("++++++++++++++ Too +++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("+++++++++ Forgot Your ID +++++++++");
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("++ Enter In Your User Name:");
		System.out.print("+++++ Their UserName: ");

		user2 = trans.nextLine();
		
		Customers cust2 = custServ2.signInCust(user2);
		
		
		Accounts account2 = custServ.getAccID(cust2.getPrivID());
		
		balance2 = account2.getBalance();
		Id2 = account2.getId();
		
		System.out.println(cust2.getUser().toUpperCase()+" balance: " + balance2);
		
		
		double amountOut = 0.0;
		
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++ Transfer Amount: ");
		
		
		amountOut = transTo.nextDouble();
		
		System.out.println("Old " + cust.getUser().toUpperCase()+" amount:" + balance1);
		System.out.println("Old " + cust2.getUser().toUpperCase()+" amount:" + balance2);
		
		if(balance1 - amountOut < 0){
			System.out.println("");
			System.out.print("Transfer Not Possible");
		} else {balance1 -= amountOut;}
		
		balance2 += amountOut;
		
		Accounts accounts1 = custServ.getAccID(cust.getPrivID());
		accounts1.setBalance(balance1);
		accounts1.setId(Id1);
		
		CustomerDao.updateAcc(accounts1);
		
		Accounts accounts2 = custServ.getAccID(cust2.getPrivID());
		accounts2.setBalance(balance2);
		accounts2.setId(Id2);
		
		CustomerDao.updateAcc(accounts2);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("Final " + cust.getUser().toUpperCase()+" amount:" + balance1);
		System.out.println("Final " + cust2.getUser().toUpperCase()+" amount:" + balance2);
		System.out.println("++++++++++++++++++++++++++++++++++");

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	

