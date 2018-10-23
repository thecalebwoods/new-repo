package BankingControls;

import Users.Accounts;
import Views.BankScanner;
import Views.Home;

public class IdControl{ 
public static boolean idHandler(long num1, long num2) {
		if( num1 == num2) {
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++ Correct! ++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++");
			return true;
		}else {	
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++ Incorrected UserName ++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++ 1.Try Again +++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		return false;
		
			}
		}
	}

