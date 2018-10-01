package Inheritance;

/*
 * 
 * Inheritance is a pillar of object oriented programming
 * Inheritance is the idea and behavior of  reutilizing class definitions by extending them 
 * to provide more detailed implementation
 * 
 * For instance, we could create a more generic class called 'computer' and extend Computer 
 * to create more specific implementations , such 'DesktopComputer' ad LaptopComputer'
 * 
 * When inheriting form a class, the inheriting class can utilize all of the inherited
 * classes fields and methods, although access modifiers must still be respected.
 * 
 */
public class computer {
	private String motherboard;
	private int GHz;
	private int ram;

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public int getGHz() {
		return GHz;
	}

	public void setGHz(int gHz) {
		GHz = gHz;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void relocate() {
		System.out.println("You relocate the computer.");
	}

	@Override
	public String toString() {
		return "computer [motherboard=" + motherboard + ", GHz=" + GHz + ", ram=" + ram + "]";
	}

	/**
	 * 
	 * toString method is used to describe how and object should be presented when
	 * output as a string
	 * 
	 * toString as an inherited method, if not defined it is still present because it
	 * as defined by the Object class, which ever class extends implicitly
	 */

	
}
