package string;

public class StringConcept {

	public static void main(String[] args) {
//		String is a Immutable in java
		String str = " Pune ";
		String str2 = new String("Pune");
		String str3 = new String("Pune");
		String str4 = "Mubai";
		String str5 = "Pune";
		
//		== --> address comparison
//		equals --> content comparison
		if (str==str3) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		if (str.equals(str3)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		String len = str.trim();
		System.out.println(len.length());

	}

}
