package Inheritance;

public class inhLauncher {
	public static void main(String[] args) {
		Inheritance.computer computer = new computer();

		computer.setMotherboard("Zoinsk");
		System.out.println(computer);
		computer.relocate();
		LaptopComputer laptop = new LaptopComputer();
		
		//Our variable / field  can hold anything that is
		// Consider of that type, HOWEVER, we only have
		// access to information defined on the type the field
		// or variable is defined with, not the actual content
		// of the field/variable
		
		DesktopComputer desktop = new DesktopComputer();
		desktop.relocate();
		
		// instanceof - Comparison Operator
		//			returns true if object is of that type
		
		if(computer instanceof DesktopComputer) {
			System.out.println("It was");
		} else {
			System.out.println("It wasnt");
		}
	}
}
