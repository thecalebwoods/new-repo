package Views;

import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Users.JointAcc;
import Utilities.UserSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;
import Utilities.JoSerialize;

public class CreateJoAcc {
	
public static void signJointUpUser(Accounts acc, Customers cust) {
	
	CustomerServ custServ = new CustomerServ();

	Scanner UserPass = new Scanner(System.in);
	
		String user = null;
		int joIn;
		String jointName = null;
		long jAccID = 0;
		int x = 0;
		

		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++  Your UserName: " + cust.getUser().toUpperCase());
	
		cust.setJoID(acc.getId());
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++ Your Joint Id: " + cust.getJoID());

		CustomerDao.updateCust(cust);
		
		addOtherUser(acc, cust);
		
		
}

public static 	void addOtherUser(Accounts acc, Customers cust) {
	
	CustomerServ custServ = new CustomerServ();

	String user = null;
	int x = 0;
	
	while(x == 0) {
		
		Scanner usersIn = new Scanner(System.in);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++ Other User Name: ");
		user = usersIn.nextLine();
		
		boolean isNull = CustomerDao.isJointNull(user);
		if( isNull == true) {
			
		boolean exists = custServ.userExist(user);
		System.out.println("not null");
		
			if(exists == true) {
				
				Customers custOther = custServ.signInCust(user);
				
				custOther.setJoID(acc.getId());
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("++++                         +++++");
				System.out.println("++++       Joint Account     +++++");
				System.out.println("++++          Created!       +++++");
				System.out.println("++++++++++++++++++++++++++++++++++");
				
				CustomerDao.updateCust(custOther);
				
				System.out.println("++++     Create Another      +++++");
				System.out.println("++++  Yes(1)          No(0)  +++++");

				int input = BankScanner.getInput(2);
				
				switch (input){
				case 0: x++; break;
				case 1: x = 0 ; break;
				}
			
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
			
				x = 0;
			}
		
		} else {
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++                         +++++");
		System.out.println("++++         Sorry!          +++++");
		System.out.println("++++        -------          +++++");
		System.out.println("++++      The Username       +++++");
		System.out.println("++++       already has       +++++");
		System.out.println("++++     a Joint Account!    +++++");
		System.out.println("++++        -------          +++++");
		System.out.println("++++    Please Try Again!    +++++");
		System.out.println("++++                         +++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
	
		x = 0;
		}
		
		
	}
	
				
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
