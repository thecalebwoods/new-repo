package Views;

import java.util.Scanner;

import adminEmployees.Employees;

public class RegisterEm {

	

		
		public static void signUpEmploy() {
				
				Scanner UserPass = new Scanner(System.in);
				String name = null;
				String email = null ;
				String number = null;
				long employeeID = 0;
				
				
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
				
				employeeID = (int)(Math.random() * 10000);
				
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("+++++++++ Your Employee Id: " + employeeID);
				System.out.println("++++++++++++++++++++++++++++++++++");


				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("+++++ Everything Look Okay? ++++++");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("++ Name: " + name) ;
				System.out.println("++ Email: " + email) ;
				System.out.println("++ Phone: " + number) ;
				System.out.println("++ ID: " + employeeID) ;
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("+++   (1)Yes   + Choose +   (2)No   +++");
				
				int input = BankScanner.getInput(2);
				
		}
}
