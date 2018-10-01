package notaccess;

import access.MyClass;

public class ChildClasss  extends MyClass{
	
	
	private void accessProtected() {
		//Can access this way
		this.protectedField = 1;
		
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		//Within the same class we can access
		//anything except private values
//		myClass.privateField = 0; //Can't access
//		myClass.protectedField = 0;//Can't access
		myClass.publicFeild = 0;
//		myClass.defaultfield = 0;//Can't access
	

	}
}
