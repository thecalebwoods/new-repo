package Views;

import java.util.Scanner;

import Users.Accounts;
import Users.Customers;
import Users.JointAcc;
import Utilities.UserSerialize;
import Utilities.JoSerialize;

public class CreateJoAcc {
	
public static void signJointUpUser(Customers cust) {
	Scanner UserPass = new Scanner(System.in);
		String user = null;
		int joIn;
		String fileUser1 = null;
		String fileUser2 = null;
		String jointName = null;
		long jAccID = 0;
		int x = 0;
		

		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++  Your UserName: " + cust.getUser().toUpperCase());
		
		jAccID = (int)(Math.random() * 10000);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++ Your Acc Id: " + jAccID);
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		cust.setJoID(jAccID);
		
		UserSerialize.saveUserFile(cust);
		
	while((x == 0)) {
		Scanner usersIn = new Scanner(System.in);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.print("++++++   User Name: ");
		user = usersIn.nextLine();
		
		
		Customers custJo = UserSerialize.loadUserFile(user);
		custJo.setJoID(cust.getJoID());
		
		System.out.println(custJo.getJoID());
		
		UserSerialize.saveUserFile(custJo);

		System.out.println("++++++++++++++++++++++++++++++++++");			
		System.out.println("++++++ Add another or Done +++++++");
		System.out.println("+++++++++ (0) ++++++  (1)  +++++++");
	
		joIn = usersIn.nextInt();
		
		x++;
	}
	
		JointAcc joint = new JointAcc();
		joint.setjAccID(cust.getJoID());
		joint.setJointName(jointName);
		
		
		JoSerialize.saveJoFile(joint);
		
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
