package oops;

public class ClassAndObject {

	public static void main(String[] args) {
//		ClassAndObject - class name 
//		obj - ref. variable
//		new - keyword
//		ClassAndObject() - class constructor  
//		new ClassAndObject();  - object
		
		ClassAndObject dev = new ClassAndObject();
		dev.walking();
		dev.running();
		dev.eating();

	}

	public void running() {
		System.out.println("Dev is running ");
	}

	public void eating() {
		System.out.println("Dev is eating ");
	}
	
	public void walking() {
		System.out.println("Dev is walking ");
	}

}
