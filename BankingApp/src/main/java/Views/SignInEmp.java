package Views;

import java.util.Scanner;

import adminEmployees.Employees;
import Utilities.CustomerServ;

public class SignInEmp {

	public static void signInEmploy(Employees emp) {
		
		
		
		CustomerServ custServ = new CustomerServ();
	
		Scanner EmployPass = new Scanner(System.in);

		long employ = 0;

		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++   Employee ID:   ");
		employ = EmployPass.nextInt();
				
		boolean exists = custServ.empExist(employ);
		
		if(exists = true) {
			
			Employees employee = custServ.getEmpID(employ);
			
			signInEmployPass(employee);
		
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
		
			signInEmploy(emp);
		}
	}
		
	public static void signInEmployPass(Employees emp) {
		
		Scanner UserPass = new Scanner(System.in);
		
		CustomerServ custServ = new CustomerServ();
		
		String pass = null;
		
			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.print("++++++   Password:   ");
			pass = UserPass.nextLine();
			
			boolean exists = pass.equals(emp.getPassword());

			
			if(exists = true) {
				System.out.println("++++++++++++++++++++++++++++++++++");			
				System.out.println("++++++++++++ Correct! ++++++++++++");
				System.out.println("++++++++++++++++++++++++++++++++++");
			
				EmployControls.checkUsers();
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
				
				signInEmployPass(emp);
			}
		}
	}
