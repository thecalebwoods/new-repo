package Views;
import Users.Accounts;
import Users.Customers;
import Utilities.CustomerServ;
import Utilities.DataManage;
import Utilities.UserSerialize;

import java.util.List;
import java.util.Scanner;

public class SignIn {
		
		
		public static void signInUser(Customers customer) {
			
			
			
			CustomerServ custServ = new CustomerServ();
		
			Scanner UserPass = new Scanner(System.in);

			String user = null;

			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.print("++++++   User Name:   ");
			user = UserPass.nextLine();
			
//			cust.setUser(user);
			
			boolean exists = custServ.userExist(user);
			
			if(exists = true) {
				
				Customers cust = custServ.signInCust(user);
				
				Accounts accounst = custServ.getAccID(cust.getPrivID());
				
				signInPass(cust);
			
			}else {
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("++++                         +++++");
				System.out.println("++++          Sorry!         +++++");
				System.out.println("++++         -------         +++++");
				System.out.println("++++     The Username you    +++++");
				System.out.println("++++ inserted wasn't correct +++++");
				System.out.println("++++    Please Try Again!    +++++");
				System.out.println("++++                         +++++");
				System.out.println("++++++++++++++++++++++++++++++++++");
			
				signInUser(customer);
			}
			
//			if(DataManage.userExist(user)) {
//				System.out.println("++++++++++++++++++++++++++++++++++");			
//				System.out.println("++++++++++++ Correct! ++++++++++++");
//				System.out.println("++++++++++++++++++++++++++++++++++");
//				
//				
//				signInPass(cust);
//				
//			}else {
//				System.out.println("++++++++++++++++++++++++++++++++++");
//				System.out.println("++++                         +++++");
//				System.out.println("++++          Sorry!         +++++");
//				System.out.println("++++         -------         +++++");
//				System.out.println("++++     The Username you    +++++");
//				System.out.println("++++ inserted wasn't correct +++++");
//				System.out.println("++++    Please Try Again!    +++++");
//				System.out.println("++++                         +++++");
//				System.out.println("++++++++++++++++++++++++++++++++++");
//			
//				signInUser();
		
		

		}
public static void signInPass(Customers cust) {
		
		Scanner UserPass = new Scanner(System.in);
		
		CustomerServ custServ = new CustomerServ();
		
		String pass = null;
		
			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.print("++++++   Password:   ");
			pass = UserPass.nextLine();
			
			boolean exists = custServ.passExist(pass);

			
			if(exists = true) {
				System.out.println("++++++++++++++++++++++++++++++++++");			
				System.out.println("++++++++++++ Correct! ++++++++++++");
				System.out.println("++++++++++++++++++++++++++++++++++");
			
				UserAccounts.userAccOptions(cust);
			}else {
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("++++                         +++++");
				System.out.println("++++          Sorry!         +++++");
				System.out.println("++++         -------         +++++");
				System.out.println("++++     The Password you    +++++");
				System.out.println("++++  entered wasn't correct +++++");
				System.out.println("++++    Please Try Again!    +++++");
				System.out.println("++++                         +++++");
				System.out.println("++++++++++++++++++++++++++++++++++");
				
				signInPass(cust);
			}
		
	}

		
//	
//	
//		
//		
//		fileUser = cust.getUser();
//		filePass = cust.getPass();
//		
//
//			int input = BankScanner.getInput(1);
//			
//			switch (input) {
//			case 1: Home.inputIsUser();break;
//			}
//		}
//		
//		
//		System.out.println("");
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.print("++++++    Password:   ");
//		pass = UserPass.nextLine();
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		
//		
//		System.out.println(filePass);
//		
//		if( pass.equals(filePass)) {
//			System.out.println("++++++++++++++++++++++++++++++++++");
//			System.out.println("++++++++++++ Correct! ++++++++++++");
//			System.out.println("++++++++++++++++++++++++++++++++++");
//			System.out.print("++++++++++++ Signing " + cust.getUser().toUpperCase() + " in ");
//			
		
//			
//			UserAccounts.userAccOptions(cust);
//		}else {	
//			System.out.println("++++++++++++++++++++++++++++++++++");
//			System.out.println("++++++ Incorrected Password ++++++");
//			System.out.println("++++++++++++++++++++++++++++++++++");
//			System.out.println("++++++++++ 1.Try Again +++++++++++");
//			System.out.println("++++++++++++++++++++++++++++++++++");
//
//		
//			int input = BankScanner.getInput(1);
//			
//			switch (input) {
//			case 1: Home.inputIsUser();break;
//			}
//		}
//	}
//	
//	public static void signInEmployee() {
//		
//		Scanner EmPass = new Scanner(System.in);
//		
//		long fileID = 0;
//		String filePass = null;
//		long Id = 0;
//		String pass = null;
//		
//		System.out.println("");
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.print("++++++   Employee ID:   ");
//		Id = EmPass.nextInt();
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		
//		Employees emp = new Employees();
//		emp.setRegisterId(Id);
//		
//		Employees cust = EmpSerializer.loadEmpFile(Id);
//		fileID = cust.getRegisterId();
//		filePass = cust.getPass();
//		
//		System.out.println("");
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.print("++++++    Password:   ");
//		pass = EmPass.nextLine();
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		
//		
//		if( pass.equals(filePass)) {
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("++++++++++++ Correct! ++++++++++++");
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.print("++++++++++++ Signing " + fileID + " in ");
//		try {
//			Thread.sleep(1500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.print(".");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.print(".");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(".");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		UserAccounts.userAccOptions(cust);
//
//		}else {	
//			System.out.println("++++++++++++++++++++++++++++++++++");
//			System.out.println("++++++ Incorrected Password ++++++");
//			System.out.println("++++++++++++++++++++++++++++++++++");
//			System.out.println("++++++++++ 1.Try Again +++++++++++");
//			System.out.println("++++++++++++++++++++++++++++++++++");
//
//		
//			int input = BankScanner.getInput(1);
//			
//			switch (input) {
//			case 1: Home.inputIsUser();break;
//			}
//		}
//		
//	}
//	
		public static void loading() {
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
			System.out.println(".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
