package array;

public class JavaArrays {
	public static void main(String[] args) {
		 
		char[] arr = new char[10]; //You'll need to know how big your arrays will be
		
		// All primitive values have a default value upon creation
		// 0, 0.0, false
		for(int i=0; i < arr.length; i++) {
			// a chat literal is a single character surrounded by single quotes 
			// Note: Double quotes represent string literals. not chars
			
			// Process of explicitly converting a type to another is called casting
			// to cast, we should include to the type in parenthesis before the value to cast
			
			arr[i] = (char) ('a' + i);//casting
			
			System.out.println(i + ": " + arr[i]);
		}
		
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
		System.out.println(++maxValue);
		
	}
}
