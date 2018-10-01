package animals;

public class Dog extends Mammal implements Boopable {

	@Override
		public void breathe() {
			System.out.println("The dog breathes");		
		}

	@Override
	public void boop() {
		System.out.println("Snoop boop the " + this.name);
	}

	@Override
	public void boop(Dog dog) {
		System.out.println(dog.name + " Snoop boops " + this.name);
	}

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "Spot";
		Dog otherDog = new Dog();
		otherDog.name = "Cookie";
		
		dog.boop();
		otherDog.boop(dog);
		
		
		
		
	}

}
