package interf;

public class AxisBank implements HDFCBank{

	@Override
	public void savingAC() {
		System.out.println("AxisBank saving ac");
		
	}

	@Override
	public void cc() {
		System.out.println("AxisBank cc");
		
	}

	@Override
	public void loan() {
		System.out.println("AxisBank loan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("HDFC Home Loan");
		
	}

}
