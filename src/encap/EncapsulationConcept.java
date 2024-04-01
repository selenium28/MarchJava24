package encap;

public class EncapsulationConcept {
	
	private String name;
	private int rollno;
	private double finalmarks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getFinalmarks() {
		return finalmarks;
	}

	public void setFinalmarks(double finalmarks) {
		this.finalmarks = finalmarks;
	}

	public static void main(String[] args) {
		EncapsulationConcept obj = new EncapsulationConcept();
		obj.setName("Yugal");
		System.out.println(obj.getName());

	}
	

}
