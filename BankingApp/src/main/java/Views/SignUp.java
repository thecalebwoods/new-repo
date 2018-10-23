package Views;
import java.awt.List;
import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Utilities.UserSerialize;
import Utilities.CustomerDao;
import Utilities.CustomerServ;

public abstract class SignUp{

@SuppressWarnings("resource")
public static void signUpUser(Accounts accounts) {
	
		Customers user = new Customers();

		CustomerServ custServ = new CustomerServ();
		
		Scanner UserPass = new Scanner(System.in);
		String users = null;
		String pass = null;
		String name = null;
		String email = null;
		String number = null;
		
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++   User Name: ");
		users = UserPass.nextLine();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++    Password: ");
		pass = UserPass.nextLine();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++    Full Name: ");
		name = UserPass.nextLine();		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++    Email: ");
		email = UserPass.nextLine();		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++    Phone: ");
		number = UserPass.nextLine();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++ Everything Look Okay? ++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++ Username: " + users) ;
		System.out.println("++ Password: " + pass) ;
		System.out.println("++ Name: " + name) ;
		System.out.println("++ Email: " + email) ;
		System.out.println("++ Phone: " + number) ;
		System.out.println("++ Privat ID: " + accounts.getId());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++   (1)Yes   + Choose +   (2)No   +++");
		
		int input = BankScanner.getInput(2);
		
		switch (input) {
		
		case 1: user.setUser(users);
				user.setPass(pass);
				user.setEmail(email);
				user.setNumber(number);
				user.setName(name);
				user.setPrivID(accounts.getId());
		
	
		Customers savedtrue = custServ.save(user);
		
		SignIn.signInUser(user);
		
		System.out.println("+++++++++++++++++++ Saved +++++++++++++++++++");
		break;
		case 2: 
		user.setUser(users);
		user.setPass(pass);
		user.setEmail(email);
		user.setNumber(number);
		user.setName(name);
		user.setPrivID(accounts.getId());
		
		Customers savedfalse = custServ.save(user);
		
		System.out.println("+++++++++++++++++++ Saved +++++++++++++++++++");


	}
}
}

