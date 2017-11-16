// Given a string, return true if it ends in "ly".

public class Task5 {

	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
	}

	public static boolean endsLy(String containsLy) {
		if (containsLy.endsWith("ly")) return true;
		else return false;
	}
	
}