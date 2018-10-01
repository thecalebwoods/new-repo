package space;

public class spaceShips {
	
	public String name;
	public int thrusters;
	public int crew;
	public double speed;
	public boolean hasLiSpeed;
	
	
	public void shipName () {
		System.out.println(this.name + " is avialable");
	}
	public void shipCrew() {
		System.out.println("Your ship has " + this.crew + " crew members on board" );
	}
	public void shipSpeed() {
		System.out.println("Your ship has " + this.thrusters + " thruster(s) that grant it the speed of " + this.speed);
	}
	public void shipLS () {
		if(this.hasLiSpeed) {
			System.out.println("Your ship has Light Speed!");
		} else {
			System.out.println("Your ship does not have the Light Speed option");
		}
	}

}
