package Utilities;

import java.io.File;
import java.util.Scanner;

import Users.Customers;

public class DataManage {

	
	public static boolean userExist(String customer) {
		File file = new File("./Users/" + customer +".ser");
		return file.exists();
	}
	
	
	public static boolean userTrySign (String customer) {	
		for(int i = 0; i < 5; i++) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.print("++++++   User Name:   ");
			customer = scanner.nextLine();
			System.out.println("++++++++++++++++++++++++++++++++++");
		
			
			if(DataManage.userExist(customer)) {
				return true;
			}else {
				System.out.println("++++++++++++++++++++++++++++++++++");
				System.out.println("++++                         +++++");
				System.out.println("++++          Sorry!         +++++");
				System.out.println("++++         -------         +++++");
				System.out.println("++++     The Username you    +++++");
				System.out.println("++++ inserted wasnt correct. +++++");
				System.out.println("++++    Please Try Again!    +++++");
				System.out.println("++++                         +++++");
				System.out.println("++++++++++++++++++++++++++++++++++");
			}
			
		} return true;
	}
}
