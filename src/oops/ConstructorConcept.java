package oops;

public class ConstructorConcept {
//	The Constructor is is called when an object of a class is created. 
//	Constructor cannot have return type
//	We can use access modifier
//	Constructor cannot use static, final & abstract 

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();

	}
	
	public void test() {
		System.out.println("Test");
	}
	
	ConstructorConcept(){
		System.out.println("Constructor Concept");
	}

}
