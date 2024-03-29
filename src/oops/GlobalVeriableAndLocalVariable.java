package oops;

public class GlobalVeriableAndLocalVariable {
	static int a = 100;
	double d = 33.33;  // Global Variable - Scope of the GV with in holl class.
	
	public static void main(String[] args) {
//		Scope of local variable within that function only
//		int a = 10 ;   // local variable
		GlobalVeriableAndLocalVariable obj = new GlobalVeriableAndLocalVariable();
		System.out.println(a);
		obj.add();

	}
	
	public void add() {
		int b = 20;
		
		System.out.println(a+b);
	}
	
}
