package references;

import java.util.Arrays;

public class Laucnher {
/*
 * Primitive types point to a location in memeory which stores
 * thier literal calue. Assingning a new varible the same value
 * as an existing one,  just creates a new place in memory 
 * holding the ams e value. There is no link between the two 
 * changing one will not change the other
 */
	
	static void primitiveDemo() {
		int x = 10;
		int y = x;
		
		x *= x;
		
		System.out.println(x);
		System.out.println(y);
	}
	
	static void modifyInt(int a) {
		a = a * 2;
	}
	static void referenceTypeDemo() {
		int[] myArr = {1, 2, 3, 4};
		int[] altArr = myArr;
	
	
		for(int i = 0; i < altArr.length; i++) {
			altArr[i] = 2 * altArr[i];
		}
		Arrays.stream(altArr).forEach(System.out::print);
		System.out.println();
		Arrays.stream(myArr).forEach(System.out::print);
	}
	
	public static void modArr(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			arr[i] = 2*arr[i];
		}
	}
	
	
	
}
