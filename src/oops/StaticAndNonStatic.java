package oops;

public class StaticAndNonStatic {

	public static void main(String[] args) {
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.display();   // Calling by using object.
		obj.multiply();
		StaticAndNonStatic.sum();   // calling in a static way - Calling by using class name
		test();    // direct calling
	}
	
	public static void sum() {
		int a = 10;
		int b = 20;
		System.out.println("Static A+B: "+ a+b);
	}
	
	public void multiply() {
		int c = 10;
		int d = 5;
		System.out.println("Non-static c*d "+ c*d);
	}
	
	public void display() {
		System.out.println("Non-static Method");
	}
	
	public static void test() {
		System.out.println("static Method");
	}

}
