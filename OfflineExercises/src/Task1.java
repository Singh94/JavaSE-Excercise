//Given a string, return a string where for every char in the original, there are two chars.

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
	}
	
	public static String doubleChar(String a) {
		String x = "";
		
		for(int i = 0; i < a.length(); i++) {
			x += a.charAt(i);
			x += a.charAt(i);
		}
		return x;
	}

}
