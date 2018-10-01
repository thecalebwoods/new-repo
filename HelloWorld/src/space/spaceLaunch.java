package space;

public class spaceLaunch {

	public static void main(String[] arg) {
		spaceShips myShip = new spaceShips();
		myShip.name = "Falcon's Call";
		myShip.thrusters = 3;
		myShip.crew = 8;
		myShip.speed= 35.8;
		myShip.hasLiSpeed = true;
		
		
		myShip.shipName();
		myShip.shipCrew();
		myShip.shipSpeed();
		myShip.shipLS();
	}
}
