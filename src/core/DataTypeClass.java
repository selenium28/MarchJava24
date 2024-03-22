package core;

public class DataTypeClass {  // class body 

	public static void main(String[] args) { // main method body
		
//		1. int 
		int a = 20;    // int - DataType, a - variable & 20 is value
		System.out.println(a);
//		int a = 30;  duplicate variables are not allowed
		int a1 = -30;
		System.out.println(a1);
//		int b = 33.33;  Type mismatch: cannot convert from double to int
		
//		2. Double
		double d = 33.33;
//		System.out.println(d);
		double d1 = 100;
		System.out.println(d1 +" " +d);
		
//		3. char
		char c = 'a';
		char c1 = 'A';
		System.out.println(c1);
		
//		4. boolean
//		true & false are keywords in java but we can use as values
		boolean b = true;
		boolean b1 = false;
		
//		5. String 
//		String is a class in java & sequence of char.
		String str = "1233";
		String str1 = "ABCDFR";
		String str2 = "!@#%$%^&";
		String str3 = "1ASD#$$";
		
		System.out.println(str1);

	}

}
