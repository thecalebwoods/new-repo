package access;

public class SamePackage {
	
	
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		
		//Within the same class we can access
		//anything except private values
		myClass.privateField = 0;
		myClass.protectedField = 0;
		myClass.publicFeild = 0;
		myClass.defaultfield = 0;
		
	}
}
