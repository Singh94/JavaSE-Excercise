// A sandwich is two pieces of bread with something in between. 
// Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "".
// If there are not two pieces of bread.

public class Task2 {

	public static void main(String[] args) {
		System.out.println(getSandwich("breadjambread"));
		System.out.println(getSandwich("xxbreadjambread"));
		System.out.println(getSandwich("xxbreadxx"));
	}
	
	
	public static String getSandwich(String a) {
		int firstBreadIndex = a.indexOf("bread") + 5;
		int lastBreadIndex = a.lastIndexOf("bread");
		String x = a.substring(firstBreadIndex, lastBreadIndex);
		
		return x;
	}

}

//TOFIX