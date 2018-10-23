package BankingControls;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Users.JointAcc;
import Utilities.JoSerialize;
import Views.BankScanner;
import Views.UserAccounts;
import adminEmployees.Employees;

public class CheckJointAccount {

public static void checkJoBalView(Customers cust) {
		
		Scanner idInput = new Scanner(System.in);
		
		
		
		JointAcc acc = JoSerialize.loadJoFile(cust.getJoID());
		
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++ Hello " + cust.getUser().toUpperCase());
	

		
		System.out.println("++++++++++++++++++++++++++++++++++");
		BigDecimal modelVal = new BigDecimal(acc.getBalance());
	    BigDecimal displayVal = modelVal.setScale(2, RoundingMode.HALF_EVEN);


	    NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
	    usdCostFormat.setMinimumFractionDigits( 1 );
	    usdCostFormat.setMaximumFractionDigits( 2 );

		System.out.println("Your Joint Balance: " + usdCostFormat.format(displayVal.doubleValue()));
	
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++          		  ++++");
		System.out.println("+++++++++++ 1.Go Back  		  ++++");
		System.out.println("+++++++++++          		  ++++");
		System.out.println("++++++++++++++++++++++++++++++++++");

		int input = BankScanner.getInput(1);
		
		switch (input) {
		case 1: UserAccounts.userAccOptions(cust, accounts);;break;
	}
}
}
