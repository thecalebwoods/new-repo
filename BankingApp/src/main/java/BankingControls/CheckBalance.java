package BankingControls;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import Users.Accounts;
import Users.Customers;
import Users.JointAcc;
import Utilities.AccSerialize;
import Utilities.CustomerServ;
import Utilities.JoSerialize;
import Utilities.UserSerialize;
import Views.BankScanner;
import Views.UserAccounts;
import adminEmployees.Employees;


public class CheckBalance{
	

	
	public static void checkBalView(Customers cust) {
		CustomerServ custServ = new CustomerServ();

		Scanner Input = new Scanner(System.in);
				
		
		double balance = 0;
		long id = cust.getID();
		String name = null;
		
		Accounts accounts = custServ.getAccID(cust.getPrivID());
		
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ Username: " + cust.getUser()) ;
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ Password: " + cust.getPass()) ;
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ Name: " + cust.getName()) ;
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ Email: " + cust.getEmail()) ;
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ SSN: " + cust.getSsn()) ;
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ Phone: " + cust.getNumber()) ;
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ Acc ID: " + accounts.getId());
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		BigDecimal AccVal = new BigDecimal(accounts.getBalance());
	    BigDecimal displayAccVal = AccVal.setScale(2, RoundingMode.HALF_EVEN);
	    NumberFormat usdAccCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
	    usdAccCostFormat.setMinimumFractionDigits( 1 );
	    usdAccCostFormat.setMaximumFractionDigits( 2 );
		System.out.println("++  Your Balance: " + usdAccCostFormat.format(displayAccVal.doubleValue()));
		
//		if(cust.getJoID()!=0) {
//		
//		JointAcc jointAcc = JoSerialize.loadJoFile(cust.getJoID());
//		
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("++ Joint Acc ID: " + cust.getJoID());
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		
//		BigDecimal JointVal = new BigDecimal(jointAcc.getBalance());
//	    BigDecimal displayJoVal = JointVal.setScale(2, RoundingMode.HALF_EVEN);
//	    NumberFormat usdJoCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
//	    usdJoCostFormat.setMinimumFractionDigits( 1 );
//	    usdJoCostFormat.setMaximumFractionDigits( 2 );
//	    
//		System.out.println("++ Your Balance: " + usdJoCostFormat.format(displayJoVal.doubleValue()));
//		
//		} else {		
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("++ Joint Acc ID: None ");
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		}
//		
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("+++++++++++          		  ++++");
//		System.out.println("+++++++++++ 1.Go Back  		  ++++");
//		System.out.println("+++++++++++ 2.Create Another  ++++");
//		System.out.println("+++++++++++          		  ++++");
//		System.out.println("++++++++++++++++++++++++++++++++++");

		int input = BankScanner.getInput(1);
		
		switch (input) {
		case 1: UserAccounts.userAccOptions(cust);break;
		case 2: ;break;
	}
	} 
}
