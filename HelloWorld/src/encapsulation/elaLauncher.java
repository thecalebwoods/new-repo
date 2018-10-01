package encapsulation;

import java.util.Scanner;

public class elaLauncher {

	public static void main(String[] args) {
		UnencapElevater elevator = new UnencapElevater();
		elevator.maxFloor = 20;
		elevator.minFloor = 1;
		elevator.position = 10.5f;
		elevator.upButton();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose an option: ");
			System.out.println("1. Exit the elevator");
			System.out.println("2. Press down button");
			System.out.println("3. Open/close door");
			System.out.println("4. check position");
			
			int option = scanner.nextInt();
			
			elevator.updateLocation();
			
			switch(option) {
			case 1: elevator.exit(); break;
			case 2: elevator.downButton(); break;
			case 3: elevator.upButton(); break;
			case 4: elevator.doorsOpen = !elevator.doorsOpen; break;
			case 5: System.out.println(elevator.position); break;
			}
			
			elevator.updateLocation();
		}
	}
}