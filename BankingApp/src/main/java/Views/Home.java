package Views;

import Users.Customers;
import Views.BankScanner;

public class Home {
	
   public static void userOrEmploy() {
	System.out.println("++++++++++++++++++++++++++++++++++");
	System.out.println("+++++     Hello Welcome!    ++++++");
	System.out.println("++++++++++++++++++++++++++++++++++");
	System.out.println();
	System.out.println("++ Employee +++ OR +++ Customer ++");
	System.out.println("+++   (1)   + Choose +   (2)   +++");
	
	int input = BankScanner.getInput(2);
	
	switch (input){
	case 1: inputIsEm(); break;
	case 2: inputIsUser(); break;
	}
   }
  	public static void inputIsEm() {
  	System.out.println("");
  	System.out.println("++++++++++++++++++++++++++++++++++");
  	System.out.println("++++++   Welcome Employee!  ++++++");
  	System.out.println("++++++++++++++++++++++++++++++++++");
  	SignIn.loading();
  	
  	SignInEmp.signInEmploy(null);
	}
  	
	public static void inputIsUser() {
	System.out.println("");
	System.out.println("++++++++++++++++++++++++++++++++++");
	System.out.println("++++++     Welcome User!!   ++++++");
	System.out.println("++++++++++++++++++++++++++++++++++");
	System.out.println("+++++ Sign In ++++++ Sign Up +++++");
	System.out.println("+++   (1)   + Choose +   (2)   +++");
	System.out.println("++++++++++++++++++++++++++++++++++");
	
	
	int input = BankScanner.getInput(2);
	
		switch (input){
		case 1: SignIn.signInUser(null); break;
		case 2: CreateAccount.createAcc(); break;
		}
	}
}
