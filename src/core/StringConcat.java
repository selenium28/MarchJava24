package core;

public class StringConcat {

	public static void main(String[] args) {
		String str = "Pune";
		String xyz = "Mumbai";
		
		int m = 100;
		int n = 200;
//		+ concat operator
		
		System.out.println(m+n);
		System.out.println(m+str);
		System.out.println(m+n+str);
		System.out.println(n+xyz+m+n); // 200Mumbai100200
		System.out.println(m+n+str+n+xyz);  // 300Pune200Mumbai
		System.out.println(str+(m+n)+xyz+m+n); // Pune300Mumbai100200
		

	}

}
