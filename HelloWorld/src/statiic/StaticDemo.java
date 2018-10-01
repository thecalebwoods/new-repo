package statiic;

/*
 * What is a class?
 * 
 * 		A blue print for an object
 * 
 * What is an object?
 * 	
 * 		An instance of a class
 * 
 * Fields and Methods are generally associated with objects
 * 
 */
	public class StaticDemo {
		int field;
		static int staticField;
		
		public void doStuff() {
			System.out.println("Doing object things");
			// Object have a context of 'this' - the current object or the calling object
			this.field =3;
			field = 4;
			staticField = 3;
		}
		
		/*
		 * Static methods are associated with the class
		 * Static methods & fields are often used for utility
		 * Static methods have no context of 'this'.
		 */
		public static void doStaticStuff() {
			System.out.println("Doing static stuff");
			// this.field = 2;
			//Can't access
		}
		
		public static void main(String[] arg) {
			StaticDemo object = new StaticDemo();
			object.doStuff();
			StaticDemo.doStaticStuff();
			object.doStaticStuff(); // <---- bad, call using Class
		}
	
	}
