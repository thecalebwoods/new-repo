package finaal;
/*
 *  Final Keyword
 *  
 *  For fields and variable: Final is like const
 *  	For primitive types this means the value cannot be changed
 *  	For reference types (objects) it means the reference connot
 *  		be changed
 *  	Note: Final does not imply immutable.
 *  For methods final dictates that the method cannot be overridden
 *  
 *  For classes final dictates that the class cannot extended
 *  
 */
public class FinalUsage {



//Not possible because FinalUsage is final - can't be extended 
	
	
//class InheritingClass extends FinalUsage {
	
//}


	public static void main(String[] args) {
		final int x = 0;
		//Cannot reassign a value on final variable x
//       x++;		
	}


class BaseClass {
	public final void finalMethod() {
		System.out.println("Doing stuff");
		}
	}
}















