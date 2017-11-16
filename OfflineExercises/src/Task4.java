// Given a string and an int n, return a string made of the first and last n chars from the string. 
// The string length will be at least n.

public class Task4 {

	public static void main(String[] args) {
		
		System.out.println(nTwice("Hello", 2));
		System.out.println(nTwice("Chocolate", 3));
		System.out.println(nTwice("Chocolate", 1));
	}
	
	public static String nTwice(String myString, int n) {
		String tempString = myString;
		
		myString = myString.substring(0, n);
		myString += tempString.substring(tempString.length() - n, tempString.length());
		return myString;
	}

}