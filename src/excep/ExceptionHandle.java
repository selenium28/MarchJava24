package excep;

public class ExceptionHandle {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
//		System.out.println(a/b);  ArithmeticException
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ar) {
			System.out.println("Exception Handled ");
		}
		
		System.out.println("Rest of code");

	}

}
