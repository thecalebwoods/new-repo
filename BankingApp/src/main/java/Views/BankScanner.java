package Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankScanner {
	
 public static Scanner homeScanner = new Scanner(System.in);
 
 public static int getInput(int maxChoice) { 
		int input = 0;
		
	// Do until they give a choice in the range
		while(input <= 0 || input > maxChoice) {
			try {
				// Get user input
				input = homeScanner.nextInt();
				// Handles bad input
			} catch(InputMismatchException ex) {
				System.out.println("Please enter a number between 1 and " + maxChoice);
				homeScanner.nextLine();
			}
		}
		//Return result
		return input;
	}
}
