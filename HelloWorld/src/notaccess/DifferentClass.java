package notaccess;

import access.MyClass;

public class DifferentClass {
	
	public void test(MyClass myClass) {
		//Protected field is not visible
		//because we're in a diff package
		// and DifferentClass si not a subclass
		//of Class
		myClass.protectedField = 0;
		myClass.publicFeild = 0;
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		
		//Within the same class we can access
		//anything except private values
//		myClass.privateField = 0;
//		myClass.protectedField = 0;
		myClass.publicFeild = 0;
//		myClass.defaultfield = 0;
		
	}
}
}
