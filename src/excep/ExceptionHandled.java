package excep;

public class ExceptionHandled {
	
//	Can we use single try & multiple catch blocks?
//	Yes
//	multiple try & single catch ?
//	No
//	inside try block we can use try block its called nested try block.

	public static void main(String[] args) {
		int a[] = new int[5];
		
		try {
			a[3] = 50;
			System.out.println(a[3]); // ArrayIndexOutOfBoundsException:
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Exception Handled");
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("ArrayIndexOutOfBoundsException Exception Handled");
		} catch (Exception e) {
			System.out.println("Normal Exception Hnadled");
		}
		
		System.out.println("Rest of code...");
	}

}
