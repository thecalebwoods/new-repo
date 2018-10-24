package Views;

import java.util.Scanner;

import BankingControls.CheckBalance;
import BankingControls.CheckJointAccount;
import BankingControls.Deposits;
import BankingControls.Transfer;
import BankingControls.Withdraw;
import Users.Customers;
import Utilities.CustomerDao;
import Utilities.CustomerServ;

public class EmployControls {
	
	
	public static void checkUsers() {
		
		String user = null;
		
		CustomerServ custSev = new CustomerServ();
		
		Scanner userIn = new Scanner(System.in);

		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++                      +++++++");
		System.out.println("+++++    Select a User     +++++++");
		System.out.println("+++++                      +++++++");

		CustomerDao.getAllUser();
		
		System.out.println("+++++                      +++++++");
   
		System.out.print("+++++   ");
		user = userIn.nextLine();
		System.out.println("+++++                      +++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		boolean exists = custSev.userExist(user);
		if(exists = true) {
			
		Customers cust = custSev.signInCust(user);
		
		UserAccounts.userAccOptions(cust);
		
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
		
			checkUsers();
		}
		
	}
	
	
	
	public static void employUserOptions(Customers cust){
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++Options++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++                      +++++++");
		System.out.println("+++++ 1.Check User Acc     +++++++");
		System.out.println("+++++ 2.Deposit for User   +++++++");
		System.out.println("+++++ 3.Withdraw for User  +++++++");
		System.out.println("+++++ 4.Transfer for User  +++++++");
		System.out.println("+++++ 5.Check User Jo Acc  +++++++");
		System.out.println("+++++ 6.Create User Jo Acc +++++++");
		System.out.println("+++++ 7.Done               +++++++");
		System.out.println("+++++                      +++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("+++++ Insert # Here: ");
		
		int input = BankScanner.getInput(7);
		
		switch (input){
		case 1: CheckBalance.checkBalView(cust);  break;
		case 2: Deposits.depositMoneyToo(cust);break;
		case 3: Withdraw.withdrawMoneyFrom(cust);break;
		case 4: Transfer.transferMoneyFrom(cust);break;
		case 5: CheckJointAccount.checkJoBalView(cust);break;
		case 6: CreateAccount.createJoAcc(cust);break;
		case 7: return;
		}
	}
}
