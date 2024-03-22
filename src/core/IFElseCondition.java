package core;

public class IFElseCondition {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		if (a>b) {
			System.out.println("A is greather than B");
		} else {
			System.out.println("B is greather than A");
		}
		
//		= & ==  ( m == n ) -- ( m=n )
//		== -> operator it is used for comparison 
		
		int m = 300;
		int n = 300;
		
		if (m == n) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

	}

}
