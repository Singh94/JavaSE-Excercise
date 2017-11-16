// Given three ints, a b c, one of them is small, one is medium and one is large. 
// Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

public class Task3 {

	public static void main(String[] args) {
		
		System.out.println(isEvenlySpaced(2, 4, 6));
		System.out.println(isEvenlySpaced(4, 6, 2));
		System.out.println(isEvenlySpaced(4, 6, 3));

	}
	
	public static boolean isEvenlySpaced(int a, int b, int c) {	
		
		int smallestInt = Integer.min(Integer.min(a, b), c);
		int middleInt = 0;
		int largestInt = Integer.max(Integer.max(a, b), c);
		
		int numArray[] = {a, b, c};
		
		for(int i = 0; i < numArray.length; i++) {
			if (numArray[i] == largestInt || numArray[i] == smallestInt);
			else middleInt = numArray[i];
		}
		
		if (middleInt - smallestInt == largestInt - middleInt) return true;
		else return false;
	}
}
