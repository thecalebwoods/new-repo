package Test;

public class MyTest {
public static void main(String[] args) {
	int myInt = 0;
	System.out.println(myInt);
	if(myInt == 0) {
		System.out.println("true");
	} else {
		System.out.println("false");
	}
	
	for(int i = 10; i > myInt; i--) {
		System.out.println(i);
	}
}
}
