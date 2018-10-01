package encapsulation;

public class UnencapElevater {
	public float position;
	public boolean doorsOpen;
	public float moving;
	public int maxFloor;
	public int minFloor;
	public boolean musicPlaying;
	
	public void updateLocation() {
		position += moving;
		if(position > maxFloor) {
			System.out.println("The elevator crashed through the roof :(");
			System.exit(1);
		}
		
		if(position < minFloor) {
			System.out.println("The elevator crashed throught the floor");
		}
	}
	public void exit() {
			if (!doorsOpen) {
				System.out.println("ouch");
				return;
			}
			if (Math.abs(position - Math.round(position)) < 0.1) {
				System.out.println("You have successfully exited the elevator. Good Work!");
				System.exit(1);
			} else {
				System.out.println("Elevators are dangerous. :(");
				System.exit(1);
			}
	}
	public void upButton() {
		System.out.println("The elevator is going up");
		moving = 0.257f;
	}
	
	public void downButton() {
		System.out.println("The elevator is going down");
		moving = -0.283f;
	}
	public void stopButton() {
		System.out.println("The elevator has stop");
		moving = 0;
	}
}
