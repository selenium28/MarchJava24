package interf;

public interface Bank {
	
	public void savingAC();
	public void cc();
	public void loan();
	
	
	default void roi() {
		System.out.println("Bank - Default ROI");
	}

}
