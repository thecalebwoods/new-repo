package Inheritance;

public class DesktopComputer {

	public class DesktopComputer extends Computer {
		private int[] pciSlot;
	
		public int[] getPciSlot() {
			return pciSlot;
		}
		
		public void setPciSlot(int[])
		this.pciSlot = pciSlot;
		
		public void relocate() {
			System.out.println("You power down, unplug, change places");
		}
		
	}

	
	
}
