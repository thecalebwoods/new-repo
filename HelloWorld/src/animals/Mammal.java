package animals;
/**
 * 
 * Abtract classes acannot be instantiated*
 * 
 * *Technically, we can define a constructor which will be called, but we 
 * cannot create types of exactly this class.
 *
 */
public abstract class Mammal {
	
	String name;
	
	// This is an abstract method
	// Any subclass of mammal. anything inheriting from it has the responsibility
	// of defining its own implementation for this method.
	public abstract void breathe();
	
	
}
