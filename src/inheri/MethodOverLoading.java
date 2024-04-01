package inheri;

public class MethodOverLoading {

//	Duplicate methods/functions are not allowed in java
//	Method inside method is not allowed in Java
//	MethodOverLoading - When method name is same with different input parameters 
//	within the same class is known as method overloading.
	
//	We can overload main method but this is a not good practice.  why? - compiler may get confused.
//	public static void main() {
//
//
//	}

	public static void main(String[] args) {


	}

	public void sum() { // zero input parameters
		System.out.println("Sum Method with zero input parameters");
	}

	public void sum(int a) { // one input parameters
		System.out.println("Sum Method with One input parameters");
	}

	public void sum(int m, int n) { // two input parameters
		System.out.println("Sum Method with Two input parameters");
	}

	public void sum(double d) { // one input parameters with diff. datatype
		System.out.println("Sum Method with One input parameters");
	}

}
