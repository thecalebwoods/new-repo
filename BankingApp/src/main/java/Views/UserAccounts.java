package Views;
import BankingControls.CheckBalance;
import BankingControls.CheckJointAccount;
import BankingControls.Deposits;
import BankingControls.Transfer;
import BankingControls.Withdraw;
import Users.Accounts;
import Users.Customers;
public class UserAccounts {


	public static void userAccOptions(Customers cust){
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++Options++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("+++++                      +++++++");
		System.out.println("+++++  1.Check User Acc    +++++++");
		System.out.println("+++++  2.Deposit           +++++++");
		System.out.println("+++++  3.Withdraw          +++++++");
		System.out.println("+++++  4.Transfer          +++++++");
		System.out.println("+++++  5.Check Joint Acc   +++++++");
		System.out.println("+++++  6.Create Joint Acc  +++++++");
		System.out.println("+++++  7.Done              +++++++");
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
	

