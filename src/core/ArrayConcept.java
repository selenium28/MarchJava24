package core;

public class ArrayConcept {

	public static void main(String[] args) {
		
//		Array: To store similar data type in array variable.
//		Size is fixed
		int a[] = new int[5];  // a[] - array of variable
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 60;  Exception - ArrayIndexOutOfBoundsException:
//		a[6] = 70;
		
		System.out.println(a[2]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		double d[] = new double[5];
		

	}

}
