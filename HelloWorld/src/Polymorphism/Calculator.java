package Polymorphism; // many forms 

public class Calculator {

	public int  sum(int a, int b) {
		System.out.println("Integer sum method called");
		return a + b;
	}

	public float sum(float a, float b) {
		System.out.println("Float sum method called");
		return a + b;
	}
	
	public int sum(int[] intArr) {
		int sum= 0;
		for(int i = 0; i < intArr.length; i++) {
			// Adding whatever is at that index to sum
			sum += intArr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator ();
		System.out.println(calculator.sum(3, 4));
		System.out.println(calculator.sum(2.5f, 3.5f));
		System.out.println(calculator.sum(new int[]{1 , 2, 3}));
	}
}
