package access;

public class MyClass {
	
	public int publicFeild;
	protected int protectedField;
	int defaultfield;
	private int privateField;
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		// From within this class we 
		// have access to all of these
		myClass.privateField = 0;
		myClass.protectedField = 0;
		myClass.publicFeild = 0;
		myClass.defaultfield = 0;
		
	}
}
