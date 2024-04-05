package abs;

public abstract class Car {
	
	// Abstraction -  In abs we can achieve 0 to 100%
	// abs method - unimplemented method
	public abstract void tyre();
	
	public abstract void petrol();
	
	public abstract void deisel();
	
	public void buttonStart() {
		System.out.println("Car - Button Start method");
	}
	
	public void keyStart() {
		System.out.println("Car - Key Start method");
	}

}
