package classes;

public class launcher {
	public static void main(String[] args) {
		// Instantiation of an object
		Animal myAnimal = new Animal();
		myAnimal.name = "Wallaby";
		myAnimal.armsCount = 2;
		myAnimal.furColor = "brown";
		myAnimal.eyeColor = "black";
		myAnimal.weight = 30.0;
		myAnimal.hasWings = false;
		
		myAnimal.move();
		myAnimal.fly();
		
		
		Animal bird = new Animal();
		bird.name = "Robin";
		bird.hasWings = true;
		bird.eyeColor = "blue";
		
		bird.fly();
		
	}
}
